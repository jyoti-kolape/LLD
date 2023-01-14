package com.examples.designpattern.decorator_design_pattern.pizza;


import com.examples.designpattern.decorator_design_pattern.pizza.decorator.ExtraCheese;
import com.examples.designpattern.decorator_design_pattern.pizza.decorator.Mashroom;

public class Main {
    public static void main(String[] args) {
        BasePizza margherita = new Mashroom(new ExtraCheese(new Margherita()));
        System.out.println(margherita.cost());
    }
}
