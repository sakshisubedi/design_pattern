package com.structural.flyweight.paintbrush;

public class ThickPen implements Pen{
    final BrushSize brushSize; //intrinsic state - shareable
    private String color; //extrinsic state - supplied by client

    public ThickPen() {
        brushSize = BrushSize.THICK;
        color = null;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw(String content) {
        System.out.println("Drawing THICK content in color : " + color);
    }
}
