package com.structural.flyweight.paintbrush;

/*
* we are building a Paint Brush application where client can use brushes on three types – THICK, THIN and MEDIUM.
* All the thick (thin or medium) brush will draw the content in exact similar fashion – only the content color will be different.
* */
public interface Pen {
    public void setColor(String color);
    public void draw(String content);
}


