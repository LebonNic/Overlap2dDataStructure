package com.arvernistudio.overlap2dstructure.item;

/**
 * Lights can be either point lights or cone lights, and are only in
 * effect if ambient light is darkened and light system is ON
 * @author nprugne
 */
public class Light extends Item {

    /**
     * Default constructor
     */
    public Light() {
    }

    /**
     * POINT or CONE (enum repersented as String in JSON)
     */
    public String type;

    /**
     * Number showing how detailed the light is – more rays – better
     */
    public int rays;

    /**
     * The distance of light in world units (radius of influence)
     */
    public float distance;

    /**
     * This is basically the rotation of light or it’s direction,
     * this only makes sense if it’s cone light
     */
    public float directionDegree;

    /**
     * The inner angle of cone light
     */
    public float coneDegree;

    /**
     * The value of “soft outer area of light
     */
    public float softnessLength;

    /**
     * Light is not planned to be dynamically moved, so lights engine
     * will optimize on that (if your engine has this type of option)
     */
    public boolean isStatic;

    /**
     * If set to false, this light will not pass through other
     * physics bodies on the scene
     */
    public boolean isXRay;

}