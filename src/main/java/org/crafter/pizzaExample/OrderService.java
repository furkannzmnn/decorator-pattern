package org.crafter.pizzaExample;

public class OrderService {

    public void placeOrder(FarmHouse pz , String extraToppings) {

        Toppings toppings = new Toppings(pz);

        System.out.println("Ordering a " + pz.getDescription() + " with " + extraToppings);

    }
}
