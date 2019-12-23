package strategy.test.impl;

import strategy.test.Duck;

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
