package com.behavioral.visitor.item;

/**
 * The Visitor interface declares a set of visiting methods that can take concrete elements
 * of an object structure as arguments.
 * These methods may have the same names if the program is written in a language that supports overloading,
 * but the type of their parameters must be different.
 */
public interface IShoppingCartVisitor {
    public int visit(FoodItem foodItem);
    public int visit(StationeryItem stationeryItem);
}
