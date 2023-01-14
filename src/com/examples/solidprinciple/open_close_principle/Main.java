package com.examples.solidprinciple.open_close_principle;

//Open for Extension and closed for modification
public class Main {
    public static void main(String[] args) {
        InvoiceRepository databaseInvoiceDao = new DatabaseInvoiceDao();
        databaseInvoiceDao.save();

        InvoiceRepository fileInvoiceDao = new FileInvoiceDao();
        fileInvoiceDao.save();
    }

}
