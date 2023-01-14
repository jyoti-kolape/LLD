package com.examples.solidprinciple.dependency_injection_principle;

public class BluetoothMouse implements Mouse{

    @Override
    public void mouseFunction() {
        System.out.println("Works with bluetooth connectivity");
    }
}
