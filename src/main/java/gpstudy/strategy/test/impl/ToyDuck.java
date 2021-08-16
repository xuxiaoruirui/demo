package gpstudy.strategy.test.impl;

import strategy.test.Duck;
import strategy.test.impl.NoFly;
import strategy.test.impl.NoQuack;

public class ToyDuck extends Duck {

    public ToyDuck() {
        setFly(new NoFly());
        setQuack(new NoQuack());
    }


    @Override
    public void display() {
        System.out.println("这是玩具鸭···");
    }
}
