package com.examples.solidprinciple.dependency_injection_principle;

public class Main {
    public static void main(String[] args) {
        MacBook macBook = new MacBook(new BluetoothKeyBoard(), new WiredMouse());
        macBook.getMacBook();
    }
}
