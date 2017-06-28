package com.braincells.factorydemo;

/**
 * Created by jaldhar on 6/27/17.
 */

public class WhiteSquare implements ColoredShape {
    @Override
    public String getColor() {
        return "white";
    }

    @Override
    public String getShape() {
        return "square";
    }
}
