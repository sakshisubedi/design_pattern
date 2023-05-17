package com.behavioral.visitor.item;

/**
 * The Element interface declares a method for “accepting” visitors.
 * This method should have one parameter declared with the type of the visitor interface.
 */
public interface IElement {
    public int accept(IShoppingCartVisitor visitor);
}
