package com.examples.solidprinciple.single_responsibilty;

// Having only one reason
public class InvoicePrinter {
    Marker marker;

    public InvoicePrinter(Marker marker) {
        this.marker = marker;
    }

    // Reason 1 : to print the invoice
    public void printInvoice(int price){
        System.out.println("Marker price is : " + price);
    }

}
