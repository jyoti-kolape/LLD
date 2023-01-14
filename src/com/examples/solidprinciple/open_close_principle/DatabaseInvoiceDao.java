package com.examples.solidprinciple.open_close_principle;

public class DatabaseInvoiceDao implements InvoiceRepository{
    @Override
    public void save() {
        System.out.println("Saved into db");
    }
}
