package com.structural.bridge.Shape;

public class Square extends Shape{
    public Square(IShapeColor color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.println("Applied " + color.fillColor() + " Color to " + getClass().getSimpleName());
    }
}
