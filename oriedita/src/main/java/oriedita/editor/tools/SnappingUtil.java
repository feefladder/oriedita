package oriedita.editor.tools;

import oriedita.editor.canvas.CreasePattern_Worker;
import origami.Epsilon;
import origami.crease_pattern.OritaCalc;
import origami.crease_pattern.element.LineSegment;
import origami.crease_pattern.element.Point;

public class SnappingUtil {
    public static Point snapToActiveAngleSystem(CreasePattern_Worker d, Point start, Point p) {
        double d_rad = 0.0;
        LineSegment s = new LineSegment(p, start);
        double d_angle_system;
        if (d.id_angle_system != 0) {
            d_angle_system = 180.0 / (double) d.id_angle_system;
            d_rad = (Math.PI / 180) * d_angle_system * (int) Math.round(OritaCalc.angle(s) / d_angle_system);
        } else {
            double[] jk = new double[7];
            double currentAngle = OritaCalc.angle(s);
            jk[1] = d.d_restricted_angle_1 - 180.0;
            jk[2] = d.d_restricted_angle_2 - 180.0;
            jk[3] = d.d_restricted_angle_3 - 180.0;
            jk[4] = 360.0 - d.d_restricted_angle_1 - 180.0;
            jk[5] = 360.0 - d.d_restricted_angle_2 - 180.0;
            jk[6] = 360.0 - d.d_restricted_angle_3 - 180.0;

            double d_kakudo_sa_min = 1000.0;
            for (int i = 1; i <= 6; i++) {
                if (Math.min(OritaCalc.angle_between_0_360(jk[i] - currentAngle), OritaCalc.angle_between_0_360(currentAngle - jk[i])) < d_kakudo_sa_min) {
                    d_kakudo_sa_min = Math.min(OritaCalc.angle_between_0_360(jk[i] - currentAngle), OritaCalc.angle_between_0_360(currentAngle - jk[i]));
                    d_rad = (Math.PI / 180) * jk[i];
                }
            }
        }
        LineSegment s2 = d.getClosestLineSegment(p);
        LineSegment snapLine = new LineSegment(s.getB(), new Point(s.determineBX() + Math.cos(d_rad), s.determineBY() + Math.sin(d_rad)));
        Point pret = OritaCalc.findProjection(snapLine, p);
        if (OritaCalc.determineLineSegmentDistance(p, s2) <= d.selectionDistance) {
            if (OritaCalc.isLineSegmentParallel(s2, snapLine, Epsilon.PARALLEL) == OritaCalc.ParallelJudgement.NOT_PARALLEL) {
                pret = OritaCalc.findIntersection(s2, snapLine);
            }
        }
        return pret;
    }

    public static Point snapToClosePointInActiveAngleSystem(CreasePattern_Worker d, Point start, Point p) {
        Point syuusei_point = snapToActiveAngleSystem(d, start, p);
        Point closestPoint = d.getClosestPoint(syuusei_point);
        double zure_kakudo = OritaCalc.angle(start, syuusei_point, start, closestPoint);
        boolean zure_flg = (Epsilon.UNKNOWN_1EN5 < zure_kakudo) && (zure_kakudo <= 360.0 - Epsilon.UNKNOWN_1EN5);
        if (zure_flg || (syuusei_point.distance(closestPoint) > d.selectionDistance)) {
            return syuusei_point;
        } else {//最寄点が角度系にのっていて、修正点とも近い場合
            return closestPoint;
        }
    }
}
