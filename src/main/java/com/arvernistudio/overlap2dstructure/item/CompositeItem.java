package com.arvernistudio.overlap2dstructure.item;

import com.arvernistudio.overlap2dstructure.scene.Composite;

/**
 * Composite item is a Group of items placed on the screen at a specific
 * coordinate with provided transformation and tint data.
 * @author nprugne
 */
public class CompositeItem extends Item {

    /**
     * Default constructor
     */
    public CompositeItem() {
        composite = new Composite();
    }

    /**
     * Composite data structure to contain another set of item types and layers
     */
    public Composite composite;

    /**
     * X coordinate of the rectangular masking information on which part
     * of this composite should be rendered – in local coordinates.
     * This is usually not used
     */
    public float scissorX;

    /**
     * Y coordinate of the rectangular masking information on which part
     * of this composite should be rendered – in local coordinates.
     * This is usually not used
     */
    public float scissorY;

    /**
     * Width of the rectangular masking information on which part of this
     * composite should be rendered – in local coordinates.
     * This is usually not used
     */
    public float scissorWidth;

    /**
     * Height of the rectangular masking information on which part of this
     * composite should be rendered – in local coordinates.
     * This is usually not used
     */
    public float scissorHeight;

    /**
     * Width of the item
     */
    public float width;

    /**
     * Height of the item
     */
    public float height ;

}