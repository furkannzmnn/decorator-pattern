package org.crafter.pizzaExample;

public class Main {
    public static void main(String[] args) {
        new OrderService().placeOrder(new FarmHouse(), "extra cheese");
    }
}