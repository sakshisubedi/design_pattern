package com.creational.builder.Beverage;

/**
 * The Director class defines the order in which to call construction steps,
   so you can create and reuse specific configurations of products.
 */
public class BeverageDirector {
    private BeverageBuilder beverageBuilder;

    public BeverageDirector(BeverageBuilder beverageBuilder) {
        this.beverageBuilder = beverageBuilder;
    }

    public Beverage getBeverage() {
        return this.beverageBuilder.getBeverage();
    }

    public void makeBeverage() {
        this.beverageBuilder.setBeverageType();
        this.beverageBuilder.setWater();
        this.beverageBuilder.setMilk();
        this.beverageBuilder.setSugar();
        this.beverageBuilder.setPowderQuantity();
    }
}
