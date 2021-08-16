package gpstudy.strategy.test.impl;

import strategy.test.Quack;

public class NoQuack implements Quack {
    @Override
    public void quack() {
        System.out.println("----不会叫");
    }
}

