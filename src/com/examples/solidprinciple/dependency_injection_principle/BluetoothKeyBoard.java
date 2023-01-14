package com.examples.solidprinciple.dependency_injection_principle;

public class BluetoothKeyBoard implements KeyBoard{
    @Override
    public void keyBoardFunctions() {
        System.out.println("works with bluetooth connectivity");
    }
}
