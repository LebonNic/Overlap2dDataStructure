package com.arvernistudio.overlap2dstructure.project;

/**
 * @author nprugne
 */
public class Resolution {

    /**
     * Default constructor
     */
    public Resolution() {
    }

    /**
     * Name of resolution
     */
    public String name;

    /**
     * Width in pixels
     */
    public int width;

    /**
     * Height in pixels
     */
    public int height;

    /**
     * Integer, if 0 base side is width, if 1, base side is height.
     * Because aspect ration might be different, base side is the one
     * that textures resizing was based on
     */
    public int base;


}