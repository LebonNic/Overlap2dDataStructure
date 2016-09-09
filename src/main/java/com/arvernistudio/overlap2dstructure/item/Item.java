package com.arvernistudio.overlap2dstructure.item;

import com.badlogic.gdx.utils.Array;

/**
 * All Item types used here, have a main item structure in common,
 * and additionally some other custom elements of their own
 * @author nprugne
 */
public class Item {

    /**
     * Default constructor
     */
    public Item() {
    }

    /**
     * A unique number identifier given by editor this item
     */
    public int uniqueId;

    /**
     * Unique string identifier given by user to this item
     */
    public String itemIdentifier;

    /**
     * Array of strings to represent tags that this item has – user generated data
     */
    public Array<String> tags;

    /**
     * Contains Custom Variables data structure. This is a String which contains
     * another JSON in it, with key values for custom variables.
     */
    public String customVars;

    /**
     * X coordinate of the item
     */
    public float x;

    /**
     * Y coordinate of the item
     */
    public float y;

    /**
     * X scale value for transformation of this item
     */
    public float scaleX;

    /**
     * Y scale value for transformation of this item
     */
    public float scaleY;

    /**
     * X local coordinate of origin point for this item
     */
    public float originX;

    /**
     * Y local coordinate of origin point for this item
     */
    public float originY;

    /**
     * Degrees in 360 system, for the item rotation
     */
    public float rotation;

    /**
     * The numberical representation of ordering in render pipeline
     */
    public int zIndex;

    /**
     * Name of layer this item is located on. It is corresponding to the
     * layer name from the list specified in Composite data structure for
     * which this item is a child
     */
    public String layerName;

    /**
     * RGBA float array of 4, to represent Color of this item, Color is used
     * to be multiplied in shader with the texture colors, to tint it
     */
    public Array<Float> tint;

    /**
     * String name of a shader that is used to render this item, this is
     * usually null, but in some custom cases users provide their custom
     * shaders
     */
    public String shaderName;

    /**
     * Shape data structure which can be attached to any item, and is usually
     * a polygon, circle or rectangle
     */
    public Shape shape;

    /**
     * Some items can have physics data structure on them to tell about their
     * mass and other physics body configuration
     */
    public Physics physics;


}