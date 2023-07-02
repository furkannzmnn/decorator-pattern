package org.crafter.pizzaExample;

public class Toppings implements PizzaDecorator{
    private final Pizza pizza;
    public Toppings(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public String getDescription() {
        return pizza.getDescription() + " Toppings";
    }
    @Override
    public double getCost() {
        return pizza.getCost() + 50;
    }
}
