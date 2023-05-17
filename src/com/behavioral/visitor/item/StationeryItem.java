package com.behavioral.visitor.item;

/**
 * Each Concrete Element must implement the acceptance method.
 * The purpose of this method is to redirect the call to the proper visitor’s method corresponding to the current
 * element class.
 * Be aware that even if a base element class implements this method,
 * all subclasses must still override this method in their own classes
 * and call the appropriate method on the visitor object.
 */
public class StationeryItem implements IElement{
    private int noOfItem;
    private int pricePerItem;
    private String name;

    public StationeryItem(int noOfItem, int pricePerItem, String name) {
        this.noOfItem = noOfItem;
        this.pricePerItem = pricePerItem;
        this.name = name;
    }

    public int getNoOfItem() {
        return noOfItem;
    }

    public int getPricePerItem() {
        return pricePerItem;
    }

    public String getName() {
        return name;
    }

    @Override
    public int accept(IShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
