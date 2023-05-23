package com.creational.abstractfactory.pizza.model;

import java.util.List;

/**
 * Abstract Products declare interfaces for a set of distinct but related products which make up a product family.
 */
public class Pizza {
    private long id;
    private String name;
    private List<String> toppingsList;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getToppingsList() {
        return toppingsList;
    }

    public void setToppingsList(List<String> toppingsList) {
        this.toppingsList = toppingsList;
    }
}
