package com.arvernistudio.overlap2dstructure.item;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;

/**
 * Array of arrays, containing vector2 data in form of array of convex
 * polygons each containing array of points in clockwise order
 * @author nprugne
 */
public class Shape {

    /**
     * Default constructor
     */
    public Shape() {
        polygons = new Array<Array<Vector2>>();
    }

    /**
     * 
     */
    public Array<Array<Vector2>> polygons;


}