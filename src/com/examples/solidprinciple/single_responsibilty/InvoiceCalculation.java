package com.examples.solidprinciple.single_responsibilty;

// Having only one reason
public class InvoiceCalculation {

    Marker marker;
    int quantity;

    public InvoiceCalculation(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    // Reason 1 : to calculate price
    public int calculatePrice(){
        int price = marker.price * quantity;
        return price;
    }
}
