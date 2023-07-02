package org.crafter.pizzaExample;

public class Cheese implements PizzaDecorator{
    private final Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Cheese";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 50;
    }
}
