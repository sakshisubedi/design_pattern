package com.structural.flyweight.paintbrush;

import java.util.HashMap;

/**
 * The Flyweight Factory manages a pool of existing flyweights.
 * With the factory, clients don’t create flyweights directly.
 * Instead, they call the factory, passing it bits of the intrinsic state of the desired flyweight.
 * The factory looks over previously created flyweights and either returns an existing one that matches search criteria
 * or creates a new one if nothing is found.
 */

public class PenFactory {
    private static final HashMap<String, Pen> pensMap = new HashMap<>();;

    public static Pen getThickPen(String color) {
        String key = color + "-THICK";
        Pen pen = pensMap.get(key);
        if(pen == null) {
            pen = new ThickPen();
            pen.setColor(color);
            pensMap.put(key, pen);
        }
        return pen;
    }

    public static Pen getThinPen(String color) {
        String key = color + "-THIN";
        Pen pen = pensMap.get(key);
        if(pen == null) {
            pen = new ThinPen();
            pen.setColor(color);
            pensMap.put(key, pen);
        }
        return pen;
    }

    public static Pen getMediumPen(String color) {
        String key = color + "-MEDIUM";
        Pen pen = pensMap.get(key);
        if(pen == null) {
            pen = new MediumPen();
            pen.setColor(color);
            pensMap.put(key, pen);
        }
        return pen;
    }
}
