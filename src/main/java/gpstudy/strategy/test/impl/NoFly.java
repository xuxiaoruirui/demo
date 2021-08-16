package gpstudy.strategy.test.impl;

import strategy.test.Fly;

public class NoFly implements Fly {
    @Override
    public void fly() {
        System.out.println("----不会飞");
    }
}
