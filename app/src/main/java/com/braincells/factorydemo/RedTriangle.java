package com.braincells.factorydemo;

/**
 * Created by jaldhar on 6/27/17.
 */

public class RedTriangle implements ColoredShape {
    @Override
    public String getColor() {
        return "red";
    }

    @Override
    public String getShape() {
        return "triangle";
    }
}
