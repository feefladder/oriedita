package origami_editor.editor.canvas;

import org.springframework.stereotype.Component;
import origami.crease_pattern.OritaCalc;
import origami.crease_pattern.element.LineSegment;
import origami.crease_pattern.element.Point;
import origami_editor.editor.MouseMode;
import origami_editor.editor.databinding.MeasuresModel;

@Component
public class MouseHandlerDisplayAngleBetweenThreePoints1 extends BaseMouseHandlerInputRestricted {
    private final CreasePattern_Worker d;
    private final MeasuresModel measuresModel;

    @Override
    public MouseMode getMouseMode() {
        return MouseMode.DISPLAY_ANGLE_BETWEEN_THREE_POINTS_1_55;
    }

    //マウス操作(ボタンを押したとき)時の作業
    public void mousePressed(Point p0) {
        Point p = new Point();
        p.set(d.camera.TV2object(p0));
        Point closest_point = d.getClosestPoint(p);
        if (p.distance(closest_point) < d.selectionDistance) {
            d.lineStepAdd(new LineSegment(closest_point, closest_point, d.lineColor));
        }
    }

    //マウス操作(ドラッグしたとき)を行う関数
    public void mouseDragged(Point p0) {
    }

    public MouseHandlerDisplayAngleBetweenThreePoints1(CreasePattern_Worker d, MeasuresModel measuresModel) {
        this.d = d;
        this.measuresModel = measuresModel;
    }

    //マウス操作(ボタンを離したとき)を行う関数
    public void mouseReleased(Point p0) {
        if (d.lineStep.size() == 3) {
            measuresModel.setMeasuredAngle1(OritaCalc.angle(d.lineStep.get(1).getA(), d.lineStep.get(2).getA(), d.lineStep.get(1).getA(), d.lineStep.get(0).getA()));
            d.lineStep.clear();
        }
    }
}
