package org.crafter.pizzaExample;

public class FarmHouse implements Pizza{
@Override
    public String getDescription() {
        return "FarmHouse";
    }

    @Override
    public double getCost() {
        return 200;
    }
}
