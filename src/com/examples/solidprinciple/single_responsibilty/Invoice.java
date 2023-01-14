package com.examples.solidprinciple.single_responsibilty;

// Having multiple reason
public class Invoice {

    Marker marker;
    int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    // Reason 1 : to calculate price
    public int calculatePrice(){
        int price = marker.price * quantity;
        return price;
    }

    // Reason 2 : to print the invoice
    public void printInvoice(){
        System.out.println("Marker price is" + calculatePrice());
    }

    // Reason 3 : to save into database
    public void saveToDb(){
        System.out.println("Saved into db");
    }
}

// It has 3 reason, so it is violating the single responsibility principle.
// How to make single responsibility in class : take look at InvoiceCalculation, PrintInvoice, InvoiceDao classes