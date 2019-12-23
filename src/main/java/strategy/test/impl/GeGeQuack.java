package strategy.test.impl;

import strategy.test.Quack;

public class GeGeQuack implements Quack {
    @Override
    public void quack() {
        System.out.println("----GeGe");
    }
}
