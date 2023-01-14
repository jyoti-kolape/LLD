package com.examples.solidprinciple.single_responsibilty;

//A class should have only one reason to change
public class Main {
    public static void main(String[] args) {
        Marker marker = new Marker("cell", "black", 10);

        InvoiceCalculation invoiceCalculation = new InvoiceCalculation(marker, 10);
        int price = invoiceCalculation.calculatePrice();
        System.out.println(price);

        InvoicePrinter invoicePrinter = new InvoicePrinter(marker);
        invoicePrinter.printInvoice(price);

        InvoiceDao invoiceDao = new InvoiceDao(marker);
        invoiceDao.saveToDb();
    }


}
