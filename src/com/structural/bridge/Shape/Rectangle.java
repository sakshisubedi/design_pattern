package com.structural.bridge.Shape;

public class Rectangle extends Shape{
    public Rectangle(IShapeColor color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.println("Applied " + color.fillColor() + " Color to " + getClass().getSimpleName());
    }
}
