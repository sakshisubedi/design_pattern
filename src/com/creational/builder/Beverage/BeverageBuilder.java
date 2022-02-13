package com.creational.builder.Beverage;

/**
 * The Builder interface declares product construction steps that are common to all types of builders.
 */
public interface BeverageBuilder {
    public void setBeverageType();

    public void setWater();

    public void setMilk();

    public void setSugar();

    public void setPowderQuantity();

    public Beverage getBeverage();
}
