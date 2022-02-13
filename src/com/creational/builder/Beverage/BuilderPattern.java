package com.creational.builder.Beverage;

/**
 * The Client must associate one of the builder objects with the director. 
   Usually, it’s done just once, via parameters of the director’s constructor. 
   Then the director uses that builder object for all further construction. 
   However, there’s an alternative approach for when the client passes the builder object to the production method of the director. 
   In this case, you can use a different builder each time you produce something with the director.
 */
public class BuilderPattern {
    public static void main(String[] args) {
       Beverage beverage = new Beverage();
       BeverageBuilder beverageBuilder = new CoffeeBuilder(beverage);
       BeverageDirector beverageDirector = new BeverageDirector(beverageBuilder);
       beverageDirector.makeBeverage();
       System.out.println("Beverage details - " + beverageDirector.getBeverage());
    }
}
