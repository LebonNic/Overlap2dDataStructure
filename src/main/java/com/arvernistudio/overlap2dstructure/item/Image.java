package com.arvernistudio.overlap2dstructure.item;

/**
 * Image item is a simple image, sprite or a polygon sprite placed on the scene
 * @author nprugne
 */
public class Image extends Item {

    /**
     * Default constructor
     */
    public Image() {
    }

    /**
     * Name of texture region to render this image
     */
    public String imageName;

    /**
     * Should this image be repeated if it’s size is bigger then region size or of
     * it is rendered as polygon (if false, it should be stretched instead)
     */
    public boolean isRepeat;

    /**
     * Is this image rendered in a custom polygon shape rather then in a normal rectangular shape
     */
    public boolean isPolygon;

}