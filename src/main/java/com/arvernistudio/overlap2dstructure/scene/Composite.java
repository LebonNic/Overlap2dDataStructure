package com.arvernistudio.overlap2dstructure.scene;

import com.arvernistudio.overlap2dstructure.item.*;
import com.badlogic.gdx.utils.Array;

/**
 * Composite structure describes a list of elements that were
 * grouped together, as well as knows a lot about item types.
 * Besides that this data structure has layers list that it consist of.
 * But doesnot know which element is located on which level.
 * @author nprugne
 */
public class Composite {

    /**
     * Default constructor
     */
    public Composite() {
    }

    /**
     * Array of Images
     */
    public Array<Image> sImages;

    /**
     * Nine patch images array
     */
    public Array<NinePatchItem> sImage9patches;

    /**
     * Array of Labels
     */
    public Array<Label> sLabels;

    /**
     * Array of Composite Item structures
     */
    public Array<CompositeItem> sComposites;

    /**
     * Array of particle effects
     */
    public Array<ParticleEffect> sParticleEffects;

    /**
     * Array of light items (point or cone lights)
     */
    public Array<Light> sLights;

    /**
     * List of spine animations (bone animations)
     */
    public Array<SpineAnimations> sSpineAnimations;

    /**
     * List of sprite frame by frame animations
     */
    public Array<SpriteAnimations> sSpriteAnimations;

    /**
     * List of spriter animations created with spriter tool
     */
    public Array<SpriterAnimations> sSpriterAnimations;

    /**
     * Array of layers, using Layer Data Structure
     */
    public Array<Layer> layers;



}