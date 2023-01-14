package com.examples.solidprinciple.dependency_injection_principle;

public class WiredKeyBoard implements KeyBoard{
    @Override
    public void keyBoardFunctions() {
        System.out.println("It is wired keyboard");
    }
}
