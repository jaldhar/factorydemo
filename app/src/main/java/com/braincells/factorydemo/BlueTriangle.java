package com.braincells.factorydemo;

/**
 * Created by jaldhar on 6/27/17.
 */

public class BlueTriangle implements ColoredShape {
    @Override
    public String getColor() {
        return "blue";
    }

    @Override
    public String getShape() {
        return "triangle";
    }
}
