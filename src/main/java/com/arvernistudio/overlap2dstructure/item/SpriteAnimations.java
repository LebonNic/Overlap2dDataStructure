package com.arvernistudio.overlap2dstructure.item;

import com.badlogic.gdx.utils.Array;

/**
 * Sprite Animations are simple frame by frame animations, that are
 * contained in a single texture atlas file.Sprite Animation region-frame
 * names are usually numbered in frame order
 * @author nprugne
 */
public class SpriteAnimations extends Item {

    /**
     * Default constructor
     */
    public SpriteAnimations() {
        frameRangeMap = new Array<FrameRange>();
    }

    /**
     * Texture atlas name of this animation
     */
    public String animationName;

    /**
     * Frames per second value
     */
    public int fps;

    /**
     * An array of frame ranges that describe sub animations in a
     * big animation frame list. For example 0 to 6 run, 7-10 jump
     */
    public Array<FrameRange> frameRangeMap;

    /**
     * Name of current sub animation from frameRangeMap
     * (i nothing then we animate all frames on sequental order)
     */
    public String currentAnimation;

    /**
     * Integer (0 – NORMAL, REVERSED – 1, LOOP – 2,
     * LOOP_REVERSED – 3, LOOP_PINGPONG – 4, LOOP_RANDOM – 5)
     */
    public int playMode;


}