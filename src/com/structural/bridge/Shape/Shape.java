package com.structural.bridge.Shape;

public abstract class Shape {
    protected IShapeColor color;

    public Shape(IShapeColor color) {
        this.color = color;
    }

    abstract public void applyColor();
}
