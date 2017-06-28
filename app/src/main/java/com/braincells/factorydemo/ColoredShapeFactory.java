package com.braincells.factorydemo;

import android.util.Log;

/**
 * Created by jaldhar on 6/27/17.
 */

public class ColoredShapeFactory {
    public ColoredShape getInstance(String shape, String color) {
        Log.d("factorydemo", "color = " + color + " "  + "shape = " + shape);

        if (shape.equalsIgnoreCase("circle")) {
            Log.d("factorydemo", "its a circle");
            if (color.equalsIgnoreCase("red")) {
                Log.d("factorydemo", "its red");
                return new RedCircle();
            } else if (color.equalsIgnoreCase("white")) {
                return new WhiteCircle();
            } else if (color.equalsIgnoreCase("blue")) {
                return new BlueCircle();
            }
        } else if (shape.equalsIgnoreCase("triangle")) {
            if (color.equalsIgnoreCase("red")) {
                return new RedTriangle();
            } else if (color.equalsIgnoreCase("white")) {
                return new WhiteTriangle();
            } else if (color.equalsIgnoreCase("blue")) {
                return new BlueTriangle();
            }
        } else if (shape.equalsIgnoreCase("square")) {
            if (color.equalsIgnoreCase("red")) {
                return new RedSquare();
            } else if (color.equalsIgnoreCase("white")) {
                return new WhiteSquare();
            }
            else if (color.equalsIgnoreCase("blue")) {
                return new BlueSquare();
            }
        }
        return null;
    }
}
