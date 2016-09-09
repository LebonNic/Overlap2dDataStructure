package com.arvernistudio.overlap2dstructure.item;

/**
 * @author nprugne
 */
public class Label extends Item {

    /**
     * Default constructor
     */
    public Label() {
    }

    /**
     * Text of label
     */
    public String text;

    /**
     * Font name of the label (font is a TTF bundled with the exported assets)
     * (you can also use bitmap fonts)
     */
    public String style;

    /**
     * Size of font in pixels
     */
    public int size;

    /**
     * Integer describing align login in bit flags described
     * here: https://github.com/libgdx/libgdx/blob/master/gdx/src/com/badlogic/gdx/utils/Align.java
     */
    public int align;

    /**
     * Width of the item
     */
    public float width;

    /**
     * Height of the item
     */
    public float height;

    /**
     * Boolean to allow or not for label to be multiline
     */
    public boolean multiline;

}