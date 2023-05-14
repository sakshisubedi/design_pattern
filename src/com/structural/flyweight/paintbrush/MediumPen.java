package com.structural.flyweight.paintbrush;

public class MediumPen implements Pen{
    final BrushSize brushSize; //intrinsic state - shareable
    private String color; //extrinsic state - supplied by client

    public MediumPen() {
        brushSize = BrushSize.MEDIUM;
        color = null;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw(String content) {
        System.out.println("Drawing MEDIUM content in color : " + color);
    }
}
