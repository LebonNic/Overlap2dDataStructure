package com.arvernistudio.overlap2dstructure.project;

import com.arvernistudio.overlap2dstructure.item.CompositeItem;
import com.arvernistudio.overlap2dstructure.scene.Scene;
import com.badlogic.gdx.utils.Array;

/**
 * Project Data contains some general data about your entire
 * project and overlap2d configuration
 * @author nprugne
 */
public class Project {

    /**
     * Default constructor
     */
    public Project() {
        originalResolution = new Resolution();
        resolutions = new Array<Resolution>();
        scenes = new Array<Scene>();
        libraryItems = new Array<CompositeItem>();
    }

    /**
     * Coordinates in o2d are set in world units, this value specifies
     * how many render-able pixels are in one world unit
     */
    public int pixelToWorld;

    /**
     * Resolution entry to specify for what screen size
     * the original textures were provided for
     */
    public Resolution originalResolution;

    /**
     * Array of supported resolutions for which overlap2d
     * generated re-sized textures
     */
    public Array<Resolution> resolutions;

    /**
     * Array of scenes for this project (Data Structure
     * containing only one element sceneName)
     */
    public Array<Scene> scenes;

    /**
     * List of Composite Item type elements each of them describes a grouped item,
     * that is not on the scene, but has a name and can be accessed via code to be placed
     * on the scene dynamically
     */
    public Array<CompositeItem> libraryItems;


}