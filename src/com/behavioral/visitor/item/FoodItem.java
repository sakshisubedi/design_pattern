package com.behavioral.visitor.item;

/**
 * Each Concrete Element must implement the acceptance method.
 * The purpose of this method is to redirect the call to the proper visitor’s method corresponding to the current
 * element class.
 * Be aware that even if a base element class implements this method,
 * all subclasses must still override this method in their own classes
 * and call the appropriate method on the visitor object.
 */
public class FoodItem implements IElement{
    private int pricePerKg;
    private int weight;
    private String name;


    public FoodItem(int pricePerKg, int weight, String name) {
        this.pricePerKg = pricePerKg;
        this.weight = weight;
        this.name = name;
    }

    public int getPricePerKg() {
        return pricePerKg;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public int accept(IShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
