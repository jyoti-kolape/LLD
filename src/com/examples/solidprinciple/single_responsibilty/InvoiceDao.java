package com.examples.solidprinciple.single_responsibilty;

// Having only one reason
public class InvoiceDao {
    Marker marker;

    public InvoiceDao(Marker marker) {
        this.marker = marker;
    }

    // Reason 1 : to save into database
    public void saveToDb(){
        System.out.println("Saved into db");
    }
}
