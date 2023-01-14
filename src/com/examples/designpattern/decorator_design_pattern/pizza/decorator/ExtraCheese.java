package com.examples.designpattern.decorator_design_pattern.pizza.decorator;

import com.examples.designpattern.decorator_design_pattern.pizza.BasePizza;


public class ExtraCheese extends ToppingsDecorator {

    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+20;
    }
}
