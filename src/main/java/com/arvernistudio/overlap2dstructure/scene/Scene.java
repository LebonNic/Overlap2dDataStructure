package com.arvernistudio.overlap2dstructure.scene;

import com.badlogic.gdx.utils.Array;

/**
 * Scene is a part of project that contains a lot of elements. One project can have many Scenes, and it’s usually used as one Level of your game, or one area, or a ui page like menu
 * @author nprugne
 */
public class Scene {

    /**
     * Default constructor
     */
    public Scene() {
    }

    /**
     * Name of the scene
     */
    public String sceneName;

    /**
     * Root element from which the rest of items will be described
     */
    public Composite composite;

    /**
     * Tells runtime that this scene will have lights
     */
    public boolean lightSystemEnabled;

    /**
     * Float array with 4 elements to describe the color of ambient light in R G B A format
     */
    public Array<Float> ambientColor;

    /**
     * Contains data about world physics of that scene
     */
    public ScenePhysics physicsPropertiesVO;

    /**
     * X coordinates for vertical guides (this are not render-able and are
     * just for developer to use as they want)
     */
    public Array<Float> verticalGuides;

    /**
     * Y coordinates for horizontal guides (this are not render-able and are just
     * for developer to use as they want)
     */
    public Array<Float> horizontalGuides;



}