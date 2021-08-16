package gpstudy.strategy.test.impl;

import strategy.test.Fly;

public class BadFly implements Fly {
    @Override
    public void fly() {
        System.out.println("----飞行很近");
    }
}
