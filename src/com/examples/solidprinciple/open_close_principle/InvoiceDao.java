package com.examples.solidprinciple.open_close_principle;

import com.examples.solidprinciple.single_responsibilty.Marker;

//Already tested file and live file
public class InvoiceDao {
    Marker marker;

    public InvoiceDao(Marker marker) {
        this.marker = marker;
    }


    public void saveToDb(){
        System.out.println("Saved into db");
    }

    //New requirement for adding to file
    public void saveToFile(){
        System.out.println("Saved into file");
    }
}

//It is adding new requirement so it is violating Open for Extension and closed for modification
// How to makeOpen for Extension and closed for modification : take look at InvoiceRepository Interface and its implemented classes DatabaseInvoiceDao and FileInvoiceDao