package com.structural.bridge.Shape;

public class BridgePattern {
    public static void main(String[] args) {
        IShapeColor red = new Red();
        IShapeColor blue = new Blue();

        Shape s1=new Rectangle(red);
        Shape s2=new Rectangle(blue);

        s1.applyColor();
        s2.applyColor();

        Shape s4=new Square(red);
        Shape s5=new Square(blue);

        s4.applyColor();
        s5.applyColor();
    }

}
