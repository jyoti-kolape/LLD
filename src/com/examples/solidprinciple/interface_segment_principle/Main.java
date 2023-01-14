package com.examples.solidprinciple.interface_segment_principle;

public class Main {
    public static void main(String[] args) {
        WaiterInterface waiterInterface = new Waiter1();
        waiterInterface.serveToCustomers();

        HelperInterface helperInterface = new Helper();
        helperInterface.washDishes();

        ChefInterface chefInterface = new Chef();
        chefInterface.cookFood();
    }
}
