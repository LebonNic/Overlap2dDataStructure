package com.arvernistudio.overlap2dstructure.item;

/**
 * Spriter Animations are animations created using http://www.brashmonkey.com/
 * @author nprugne
 */
public class SpriterAnimations extends Item {

    /**
     * Default constructor
     */
    public SpriterAnimations() {
    }

    /**
     * Name of the animation to be found in exported assets
     */
    public String animationName;

    /**
     * Integer of entity as described in Spriter docs
     */
    public int entity;

    /**
     * Integer of current sub animation as described inSpriter docs
     */
    public int animation;

}