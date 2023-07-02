package org.crafter.pizzaExample;

public class Margherita implements Pizza{
@Override
    public String getDescription() {
        return "Margherita";
    }

    @Override
    public double getCost() {
        return 100;
    }
}
