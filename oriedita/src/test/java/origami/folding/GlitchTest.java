package origami.folding;

import org.tinylog.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import origami.crease_pattern.FoldingException;
import origami.crease_pattern.LineSegmentSet;
import oriedita.editor.save.Save;
import oriedita.editor.swing.component.BulletinBoard;
import oriedita.editor.export.Cp;

import java.io.IOException;

public class GlitchTest {
        @Test
    public void testFoldGlitch() throws IOException {
        Save save = Cp.importFile(getClass().getClassLoader().getResourceAsStream("glitch.cp"));

        FoldedFigure foldedFigure = new FoldedFigure(new BulletinBoard());

        LineSegmentSet lineSegmentSet = new LineSegmentSet();

        lineSegmentSet.setSave(save);

        try {
            foldedFigure.estimationOrder = FoldedFigure.EstimationOrder.ORDER_3;
            foldedFigure.folding_estimated(lineSegmentSet, 1);

            Assertions.assertEquals(119, foldedFigure.foldedFigure_worker.SubFaceTotal, "Expected 119 SubFaces");
        } catch (InterruptedException | FoldingException e) {
            Logger.error(e, "test got interrupted");
            Assertions.fail();
        }
    }
}
