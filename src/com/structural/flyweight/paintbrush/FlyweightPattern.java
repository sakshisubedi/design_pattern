package com.structural.flyweight.paintbrush;

/**
 * The Client calculates or stores the extrinsic state of flyweights. From the client’s perspective, a flyweight is a template object which can be configured at runtime by passing some contextual data into parameters of its methods.
 *
 * The Flyweight pattern is merely an optimization.
 * Before applying it, make sure your program does have the RAM consumption problem related to having a massive number
 * of similar objects in memory at the same time.
 * Make sure that this problem can’t be solved in any other meaningful way.
 */
public class FlyweightPattern {
    public static void main(String[] args) {

        Pen yellowThinPen1 = PenFactory.getThickPen("YELLOW");
        yellowThinPen1.draw("Hello World !!");

        Pen yellowThinPen2 = PenFactory.getThickPen("YELLOW");  //pen is shared
        yellowThinPen2.draw("Hello World !!");

        Pen blueThinPen = PenFactory.getThickPen("BLUE");   //created new pen
        blueThinPen.draw("Hello World !!");

        System.out.println(yellowThinPen1.hashCode()); // same object
        System.out.println(yellowThinPen2.hashCode()); // same object

        System.out.println(blueThinPen.hashCode());
    }
}
