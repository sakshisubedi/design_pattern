package com.creational.builder.Beverage;

/**
 * Concrete Builders provide different implementations of the construction steps. 
   Concrete builders may produce products that don’t follow the common interface.
   For example, CoffeeBuilder producing Beverage1 and TeaBuilder producing Beverage2 
 */
public class CoffeeBuilder implements BeverageBuilder {
    private Beverage beverage;

    public CoffeeBuilder(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public void setBeverageType() {
        System.out.println("Making coffee");
        beverage.setBeverageName("Coffee");
    }

    @Override
    public void setWater() {
        System.out.println("Step 1 : Boiling water");
        beverage.setWater(40);
    }

    @Override
    public void setMilk() {
        System.out.println("Step 2 : Adding milk");
        beverage.setMilk(50);
    }

    @Override
    public void setSugar() {
        System.out.println("Step 3 : Adding sugar");
        beverage.setSugar(10);
    }

    @Override
    public void setPowderQuantity() {
        System.out.println("Step 4 : Adding coffee powder");
        beverage.setPowderQuantity(15);
    }

    /**
     * We can make BeverageBuilder as a abstract class and add this method there.
       Also, not necessary that BeverageBuilder construct same type of Product. Therefore concrete builders should implement this.
       Example:- Beverage as product interface and Beverage1 & Beverage2 as concrete product.
       And, CoffeeBuilder produces Beverage1 and TeaBuilder produces Beverage2 
     */
    @Override
    public Beverage getBeverage() {
        return this.beverage;
    }
}
