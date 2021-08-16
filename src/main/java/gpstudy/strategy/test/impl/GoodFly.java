package gpstudy.strategy.test.impl;

import strategy.test.Fly;

public class GoodFly implements Fly {
    @Override
    public void fly() {
        System.out.println("----很会飞");
    }
}
