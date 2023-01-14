package com.examples.solidprinciple.dependency_injection_principle;

public class WiredMouse implements Mouse{
    @Override
    public void mouseFunction() {
        System.out.println("Works with wire");
    }
}
