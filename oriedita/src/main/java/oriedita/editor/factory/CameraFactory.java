package oriedita.editor.factory;

import dagger.Module;
import dagger.Provides;
import oriedita.editor.databinding.*;
import oriedita.editor.drawing.tools.Camera;

import javax.inject.Named;
import javax.inject.Singleton;

@Module
public abstract class CameraFactory {
    @Provides
    @Singleton
    @Named("creasePatternCamera")
    public static Camera creasePatternCamera(CameraModel cameraModel) {
        Camera creasePatternCamera = new Camera();
        cameraModel.addPropertyChangeListener(e -> creasePatternCamera.setData(cameraModel));
        return creasePatternCamera;
    }

}
