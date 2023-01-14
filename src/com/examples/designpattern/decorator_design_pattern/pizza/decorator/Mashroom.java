package com.examples.designpattern.decorator_design_pattern.pizza.decorator;

import com.examples.designpattern.decorator_design_pattern.pizza.BasePizza;

public class Mashroom extends ToppingsDecorator {

    BasePizza basePizza;

    public Mashroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 50;
    }
}
