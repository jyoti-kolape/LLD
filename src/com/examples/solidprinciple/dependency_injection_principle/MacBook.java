package com.examples.solidprinciple.dependency_injection_principle;

public class MacBook {
    private final KeyBoard keyBoard;
    private final Mouse mouse;

    public MacBook(KeyBoard keyBoard, Mouse mouse) {
        this.keyBoard = keyBoard;
        this.mouse = mouse;
    }

    public void getMacBook(){
        keyBoard.keyBoardFunctions();
        mouse.mouseFunction();
    }
}
