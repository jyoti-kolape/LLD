package com.examples.solidprinciple.interface_segment_principle;

public class Waiter implements RestaurantEmployee{
    @Override
    public void serveToCustomers() {
        System.out.println("Serving food to Customers");
    }

    // Do not need to implement
    @Override
    public void cookFood() {
        System.out.println("This is not my job");
    }

    // Do not need to implement
    @Override
    public void washDishes() {
        System.out.println("This is not my job");
    }
}
