package com.creational.builder.Beverage;

/**
 * Concrete Builders provide different implementations of the construction steps. 
   Concrete builders may produce products that don’t follow the common interface.
   For example, CoffeeBuilder producing Beverage1 and TeaBuilder producing Beverage2 
 */
public class TeaBuilder implements BeverageBuilder {
    private Beverage beverage;

    public TeaBuilder(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public void setBeverageType() {
        System.out.println("Making tea");
        beverage.setBeverageName("Tea");
    }

    @Override
    public void setWater() {
        System.out.println("Step 1 : Boiling water");
        beverage.setWater(50);
    }

    @Override
    public void setMilk() {
        System.out.println("Step 2 : Adding milk");
        beverage.setMilk(60);
    }

    @Override
    public void setSugar() {
        System.out.println("Step 3 : Adding sugar");
        beverage.setSugar(15);
    }

    @Override
    public void setPowderQuantity() {
        System.out.println("Step 4 : Adding tea powder");
        beverage.setPowderQuantity(20);
    }

    @Override
    public Beverage getBeverage() {
        return this.beverage;
    }
}
