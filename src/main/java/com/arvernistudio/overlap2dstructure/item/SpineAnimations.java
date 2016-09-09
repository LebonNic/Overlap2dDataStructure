package com.arvernistudio.overlap2dstructure.item;

/**
 * Spine Animations are animations created using http://esotericsoftware.com/
 * @author nprugne
 */
public class SpineAnimations extends Item {

    /**
     * Default constructor
     */
    public SpineAnimations() {
    }

    /**
     * Name of entire animation, where it’s settings are found
     */
    public String animationName;

    /**
     * Each spine animation contains several sub animations, like run, jump e.g.
     * this is the current playing animation name
     */
    public String currentAnimationName;

}