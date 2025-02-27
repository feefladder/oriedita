package oriedita.editor.factory;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoSet;
import dagger.multibindings.Multibinds;
import oriedita.editor.action.*;

import java.util.Set;

@Module
public interface MouseHandlerFactory {
    @Multibinds
    Set<MouseModeHandler> mouseModeHandler();

    @Binds @IntoSet MouseModeHandler mouseHandlerAddFoldingConstraints(MouseHandlerAddFoldingConstraints mouseHandlerAddFoldingConstraints);
    @Binds @IntoSet MouseModeHandler mouseHandlerAngleSystem(MouseHandlerAngleSystem mouseHandlerAngleSystem);
    @Binds @IntoSet MouseModeHandler mouseHandlerBackgroundChangePosition(MouseHandlerBackgroundChangePosition mouseHandlerBackgroundChangePosition);
    @Binds @IntoSet MouseModeHandler mouseHandlerChangeCreaseType(MouseHandlerChangeCreaseType mouseHandlerChangeCreaseType);
    @Binds @IntoSet MouseModeHandler mouseHandlerChangeStandardFace(MouseHandlerChangeStandardFace mouseHandlerChangeStandardFace);
    @Binds @IntoSet MouseModeHandler mouseHandlerCircleChangeColor(MouseHandlerCircleChangeColor mouseHandlerCircleChangeColor);
    @Binds @IntoSet MouseModeHandler mouseHandlerCircleDraw(MouseHandlerCircleDraw mouseHandlerCircleDraw);
    @Binds @IntoSet MouseModeHandler mouseHandlerCircleDrawConcentric(MouseHandlerCircleDrawConcentric mouseHandlerCircleDrawConcentric);
    @Binds @IntoSet MouseModeHandler mouseHandlerCircleDrawConcentricSelect(MouseHandlerCircleDrawConcentricSelect mouseHandlerCircleDrawConcentricSelect);
    @Binds @IntoSet MouseModeHandler mouseHandlerCircleDrawConcentricTwoCircleSelect(MouseHandlerCircleDrawConcentricTwoCircleSelect mouseHandlerCircleDrawConcentricTwoCircleSelect);
    @Binds @IntoSet MouseModeHandler mouseHandlerCircleDrawFree(MouseHandlerCircleDrawFree mouseHandlerCircleDrawFree);
    @Binds @IntoSet MouseModeHandler mouseHandlerCircleDrawInverted(MouseHandlerCircleDrawInverted mouseHandlerCircleDrawInverted);
    @Binds @IntoSet MouseModeHandler mouseHandlerCircleDrawSeparate(MouseHandlerCircleDrawSeparate mouseHandlerCircleDrawSeparate);
    @Binds @IntoSet MouseModeHandler mouseHandlerCircleDrawTangentLine(MouseHandlerCircleDrawTangentLine mouseHandlerCircleDrawTangentLine);
    @Binds @IntoSet MouseModeHandler mouseHandlerCircleDrawThreePoint(MouseHandlerCircleDrawThreePoint mouseHandlerCircleDrawThreePoint);
    @Binds @IntoSet MouseModeHandler mouseHandlerContinuousSymmetricDraw(MouseHandlerContinuousSymmetricDraw mouseHandlerContinuousSymmetricDraw);
    @Binds @IntoSet MouseModeHandler mouseHandlerCreaseAdvanceType(MouseHandlerCreaseAdvanceType mouseHandlerCreaseAdvanceType);
    @Binds @IntoSet MouseModeHandler mouseHandlerCreaseCopy(MouseHandlerCreaseCopy mouseHandlerCreaseCopy);
    @Binds @IntoSet MouseModeHandler mouseHandlerCreaseCopy4p(MouseHandlerCreaseCopy4p mouseHandlerCreaseCopy4p);
    @Binds @IntoSet MouseModeHandler mouseHandlerCreaseDeleteIntersecting(MouseHandlerCreaseDeleteIntersecting mouseHandlerCreaseDeleteIntersecting);
    @Binds @IntoSet MouseModeHandler mouseHandlerCreaseDeleteOverlapping(MouseHandlerCreaseDeleteOverlapping mouseHandlerCreaseDeleteOverlapping);
    @Binds @IntoSet MouseModeHandler mouseHandlerCreaseMakeAux(MouseHandlerCreaseMakeAux mouseHandlerCreaseMakeAux);
    @Binds @IntoSet MouseModeHandler mouseHandlerCreaseMakeEdge(MouseHandlerCreaseMakeEdge mouseHandlerCreaseMakeEdge);
    @Binds @IntoSet MouseModeHandler mouseHandlerCreaseMakeMountain(MouseHandlerCreaseMakeMountain mouseHandlerCreaseMakeMountain);
    @Binds @IntoSet MouseModeHandler mouseHandlerCreaseMakeMV(MouseHandlerCreaseMakeMV mouseHandlerCreaseMakeMV);
    @Binds @IntoSet
    MouseModeHandler mouseHandlerCreaseMakeValley(MouseHandlerCreaseMakeValley mouseHandlerCreaseMakeValley);
    @Binds @IntoSet MouseModeHandler mouseHandlerCreaseMove(MouseHandlerCreaseMove mouseHandlerCreaseMove);
    @Binds @IntoSet MouseModeHandler mouseHandlerCreaseMove4p(MouseHandlerCreaseMove4p mouseHandlerCreaseMove4p);
    @Binds @IntoSet MouseModeHandler mouseHandlerCreasesAlternateMV(MouseHandlerCreasesAlternateMV mouseHandlerCreasesAlternateMV);
    @Binds @IntoSet MouseModeHandler mouseHandlerCreaseSelect(MouseHandlerCreaseSelect mouseHandlerCreaseSelect);
    @Binds @IntoSet MouseModeHandler mouseHandlerCreaseToggleMV(MouseHandlerCreaseToggleMV mouseHandlerCreaseToggleMV);
    @Binds @IntoSet MouseModeHandler mouseHandlerCreaseUnselect(MouseHandlerCreaseUnselect mouseHandlerCreaseUnselect);
    @Binds @IntoSet MouseModeHandler mouseHandlerDeletePoint(MouseHandlerDeletePoint mouseHandlerDeletePoint);
    @Binds @IntoSet MouseModeHandler mouseHandlerDisplayAngleBetweenThreePoints1(MouseHandlerDisplayAngleBetweenThreePoints1 mouseHandlerDisplayAngleBetweenThreePoints1);
    @Binds @IntoSet MouseModeHandler mouseHandlerDisplayAngleBetweenThreePoints2(MouseHandlerDisplayAngleBetweenThreePoints2 mouseHandlerDisplayAngleBetweenThreePoints2);
    @Binds @IntoSet MouseModeHandler mouseHandlerDisplayAngleBetweenThreePoints3(MouseHandlerDisplayAngleBetweenThreePoints3 mouseHandlerDisplayAngleBetweenThreePoints3);
    @Binds @IntoSet MouseModeHandler mouseHandlerDisplayLengthBetweenPoints1(MouseHandlerDisplayLengthBetweenPoints1 mouseHandlerDisplayLengthBetweenPoints1);
    @Binds @IntoSet MouseModeHandler mouseHandlerDisplayLengthBetweenPoints2(MouseHandlerDisplayLengthBetweenPoints2 mouseHandlerDisplayLengthBetweenPoints2);
    @Binds @IntoSet MouseModeHandler mouseHandlerDoubleSymmetricDraw(MouseHandlerDoubleSymmetricDraw mouseHandlerDoubleSymmetricDraw);
    @Binds @IntoSet MouseModeHandler mouseHandlerDrawCreaseAngleRestricted(MouseHandlerDrawCreaseAngleRestricted mouseHandlerDrawCreaseAngleRestricted);
    @Binds @IntoSet MouseModeHandler mouseHandlerDrawCreaseAngleRestricted2(MouseHandlerDrawCreaseAngleRestricted2 mouseHandlerDrawCreaseAngleRestricted2);
    @Binds @IntoSet MouseModeHandler mouseHandlerDrawCreaseAngleRestricted3_2(MouseHandlerDrawCreaseAngleRestricted3_2 mouseHandlerDrawCreaseAngleRestricted3_2);
    @Binds @IntoSet MouseModeHandler mouseHandlerDrawCreaseAngleRestricted5(MouseHandlerDrawCreaseAngleRestricted5 mouseHandlerDrawCreaseAngleRestricted5);
    @Binds @IntoSet MouseModeHandler mouseHandlerDrawCreaseFree(MouseHandlerDrawCreaseFree mouseHandlerDrawCreaseFree);
    @Binds @IntoSet MouseModeHandler mouseHandlerDrawCreaseRestricted(MouseHandlerDrawCreaseRestricted mouseHandlerDrawCreaseRestricted);
    @Binds @IntoSet MouseModeHandler mouseHandlerDrawCreaseSymmetric(MouseHandlerDrawCreaseSymmetric mouseHandlerDrawCreaseSymmetric);
    @Binds @IntoSet MouseModeHandler mouseHandlerDrawPoint(MouseHandlerDrawPoint mouseHandlerDrawPoint);
    @Binds @IntoSet MouseModeHandler mouseHandlerFishBoneDraw(MouseHandlerFishBoneDraw mouseHandlerFishBoneDraw);
    @Binds @IntoSet MouseModeHandler mouseHandlerFlatFoldableCheck(MouseHandlerFlatFoldableCheck mouseHandlerFlatFoldableCheck);
    @Binds @IntoSet MouseModeHandler mouseHandlerFoldableLineDraw(MouseHandlerFoldableLineDraw mouseHandlerFoldableLineDraw);
    @Binds @IntoSet MouseModeHandler mouseHandlerFoldableLineInput(MouseHandlerFoldableLineInput mouseHandlerFoldableLineInput);
    @Binds @IntoSet MouseModeHandler mouseHandlerInward(MouseHandlerInward mouseHandlerInward);
    @Binds @IntoSet MouseModeHandler mouseHandlerLengthenCrease(MouseHandlerLengthenCrease mouseHandlerLengthenCrease);
    @Binds @IntoSet MouseModeHandler mouseHandlerLengthenCreaseSameColor(MouseHandlerLengthenCreaseSameColor mouseHandlerLengthenCreaseSameColor);
    @Binds @IntoSet MouseModeHandler mouseHandlerLineSegmentDelete(MouseHandlerLineSegmentDelete mouseHandlerLineSegmentDelete);
    @Binds @IntoSet MouseModeHandler mouseHandlerLineSegmentDivision(MouseHandlerLineSegmentDivision mouseHandlerLineSegmentDivision);
    @Binds @IntoSet MouseModeHandler mouseHandlerLineSegmentRatioSet(MouseHandlerLineSegmentRatioSet mouseHandlerLineSegmentRatioSet);
    @Binds @IntoSet MouseModeHandler mouseHandlerModifyCalculatedShape(MouseHandlerModifyCalculatedShape mouseHandlerModifyCalculatedShape);
    @Binds @IntoSet MouseModeHandler mouseHandlerMoveCalculatedShape(MouseHandlerMoveCalculatedShape mouseHandlerMoveCalculatedShape);
    @Binds @IntoSet MouseModeHandler mouseHandlerMoveCreasePattern(MouseHandlerMoveCreasePattern mouseHandlerMoveCreasePattern);
    @Binds @IntoSet MouseModeHandler mouseHandlerOperationFrameCreate(MouseHandlerOperationFrameCreate mouseHandlerOperationFrameCreate);
    @Binds @IntoSet MouseModeHandler mouseHandlerParallelDraw(MouseHandlerParallelDraw mouseHandlerParallelDraw);
    @Binds @IntoSet MouseModeHandler mouseHandlerParallelDrawWidth(MouseHandlerParallelDrawWidth mouseHandlerParallelDrawWidth);
    @Binds @IntoSet MouseModeHandler mouseHandlerPerpendicularDraw(MouseHandlerPerpendicularDraw mouseHandlerPerpendicularDraw);
    @Binds @IntoSet MouseModeHandler mouseHandlerPolygonSetNoCorners(MouseHandlerPolygonSetNoCorners mouseHandlerPolygonSetNoCorners);
    @Binds @IntoSet MouseModeHandler mouseHandlerSelectLineIntersecting(MouseHandlerSelectLineIntersecting mouseHandlerSelectLineIntersecting);
    @Binds @IntoSet MouseModeHandler mouseHandlerSelectPolygon(MouseHandlerSelectPolygon mouseHandlerSelectPolygon);
    @Binds @IntoSet MouseModeHandler mouseHandlerSquareBisector(MouseHandlerSquareBisector mouseHandlerSquareBisector);
    @Binds @IntoSet MouseModeHandler mouseHandlerSymmetricDraw(MouseHandlerSymmetricDraw mouseHandlerSymmetricDraw);
    @Binds @IntoSet MouseModeHandler mouseHandlerUnselectLineIntersecting(MouseHandlerUnselectLineIntersecting mouseHandlerUnselectLineIntersecting);
    @Binds @IntoSet MouseModeHandler mouseHandlerUnselectPolygon(MouseHandlerUnselectPolygon mouseHandlerUnselectPolygon);
    @Binds @IntoSet MouseModeHandler mouseHandlerUnused_6(MouseHandlerUnused_6 mouseHandlerUnused_6);
    @Binds @IntoSet MouseModeHandler mouseHandlerUnused_10001(MouseHandlerUnused_10001 mouseHandlerUnused_10001);
    @Binds @IntoSet MouseModeHandler mouseHandlerUnused_10002(MouseHandlerUnused_10002 mouseHandlerUnused_10002);
    @Binds @IntoSet MouseModeHandler mouseHandlerVertexDeleteOnCrease(MouseHandlerVertexDeleteOnCrease mouseHandlerVertexDeleteOnCrease);
    @Binds @IntoSet MouseModeHandler mouseHandlerVertexMakeAngularlyFlatFoldable(MouseHandlerVertexMakeAngularlyFlatFoldable mouseHandlerVertexMakeAngularlyFlatFoldable);
    @Binds @IntoSet MouseModeHandler mouseHandlerVoronoiCreate(MouseHandlerVoronoiCreate mouseHandlerVoronoiCreate);
}
