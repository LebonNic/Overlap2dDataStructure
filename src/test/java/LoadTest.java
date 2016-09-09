import com.arvernistudio.overlap2dstructure.item.CompositeItem;
import com.arvernistudio.overlap2dstructure.item.Label;
import com.arvernistudio.overlap2dstructure.item.NinePatchItem;
import com.arvernistudio.overlap2dstructure.project.Project;
import com.arvernistudio.overlap2dstructure.scene.Layer;
import com.arvernistudio.overlap2dstructure.scene.Scene;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.Json;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(GdxTestRunner.class)
public class LoadTest {

    private float _epsilon = 0.001f;

    @Test
    public void SceneLoadTest(){
        Json json = new Json();
        Scene scene = json.fromJson(Scene.class, Gdx.files.local(
                "src/test/resources/export/scenes/MainMenuScreen.dt"
        ));

        assertEquals("MainMenuScreen", scene.sceneName);
        assertEquals(1, scene.composite.sImage9patchs.size);
        assertEquals(2, scene.composite.sLabels.size);
        assertEquals(3, scene.composite.sComposites.size);
        assertEquals(1, scene.composite.layers.size);
        assertEquals(0, scene.composite.sImages.size);
        assertEquals(0, scene.composite.sLights.size);
        assertEquals(0, scene.composite.sParticleEffects.size);
        assertEquals(0, scene.composite.sSpineAnimations.size);
        assertEquals(0, scene.composite.sSpriteAnimations.size);
        assertEquals(0, scene.composite.sSpriterAnimations.size);

        NinePatchItem ninePatchItem = scene.composite.sImage9patchs.first();
        assertEquals("yellowbutton06", ninePatchItem.imageName);
        assertEquals("Default", ninePatchItem.layerName);
        assertEquals(4.0f, ninePatchItem.width, _epsilon);
        assertEquals(6.0f, ninePatchItem.height, _epsilon);
        assertEquals("MainMenuBackground", ninePatchItem.itemIdentifier);

        Label label = scene.composite.sLabels.first();
        assertEquals("HighScoreLabel", label.itemIdentifier);
        assertEquals("HIGH SCORE:", label.text);
        assertEquals("Aharoni", label.style);
        assertEquals(20, label.size);
        assertEquals(1, label.align);
        assertEquals(3.0f, label.width, _epsilon);
        assertEquals(0.75f, label.height, _epsilon);
        assertEquals(4, label.zIndex);
        assertEquals(0.5f, label.x, _epsilon);
        assertEquals(3.7f, label.y, _epsilon);
        assertEquals(0.0f, label.tint.get(0), _epsilon);
        assertEquals(0.0f, label.tint.get(1), _epsilon);
        assertEquals(0.0f, label.tint.get(2), _epsilon);
        assertEquals(1.0f, label.tint.get(3), _epsilon);
        assertEquals("Default", label.layerName);

        Layer layer = scene.composite.layers.first();
        assertEquals("Default", layer.layerName);
        assertEquals(true, layer.isVisible);
        assertEquals(false, layer.isLocked);

        CompositeItem compositeItem = scene.composite.sComposites.first();
        assertEquals(17, compositeItem.uniqueId);
        assertEquals("Title", compositeItem.itemIdentifier);
        assertEquals(0.5f, compositeItem.x, _epsilon);
        assertEquals(4.5f, compositeItem.y, _epsilon);
        assertEquals(0.0f, compositeItem.originX, _epsilon);
        assertEquals(0.0f, compositeItem.originY, _epsilon);
        assertEquals(1, compositeItem.zIndex);
        assertEquals("Default", compositeItem.layerName);
        assertEquals(3.01f, compositeItem.width, _epsilon);
        assertEquals(0.76, compositeItem.height, _epsilon);
        assertEquals(1, compositeItem.composite.sImage9patchs.size);
        assertEquals(1, compositeItem.composite.sLabels.size);
        assertEquals(1, compositeItem.composite.layers.size);
    }

    @Test
    public void ProjectLoadTest(){
        Json json = new Json();
        Project project = json.fromJson(Project.class, Gdx.files.local(
                "src/test/resources/export/project.dt"
        ));

        assertEquals(80, project.pixelToWorld);
        assertEquals("orig", project.originalResolution.name);
        assertEquals(1920, project.originalResolution.width);
        assertEquals(1200, project.originalResolution.height);
        assertEquals(2, project.scenes.size);

        Scene scene = project.scenes.first();
        assertEquals("MainScene", scene.sceneName);
        assertNotNull(scene.physicsPropertiesVO);
    }
}
