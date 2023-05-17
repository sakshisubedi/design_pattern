package com.behavioral.visitor.item;

/**
 * Each Concrete Visitor implements several versions of the same behaviors,
 * tailored for different concrete element classes.
 */
public class ShoppingCartVisitor implements IShoppingCartVisitor{
    @Override
    public int visit(FoodItem foodItem) {
        int cost=0;

        if(foodItem.getPricePerKg()*foodItem.getWeight() > 500){
            cost = (int) ((foodItem.getPricePerKg()- 50)*foodItem.getWeight());
        }else{
            cost = foodItem.getPricePerKg()*foodItem.getWeight();
        }
        System.out.println(foodItem.getName()+":"+foodItem.getWeight() + " kg in weight"+" costs :: "+cost);
        return cost;
    }

    @Override
    public int visit(StationeryItem stationeryItem) {
        int cost = stationeryItem.getPricePerItem()*stationeryItem.getNoOfItem();
        System.out.println(stationeryItem.getName() + ":: total cost = "+cost);
        return cost;
    }
}
