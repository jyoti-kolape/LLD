package com.examples.solidprinciple.interface_segment_principle;

public class Waiter1 implements WaiterInterface{
    @Override
    public void serveToCustomers() {
        System.out.println("Serving food to Customers");
    }
}
