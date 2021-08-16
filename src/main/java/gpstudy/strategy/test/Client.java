package gpstudy.strategy.test;

import strategy.test.impl.ToyDuck;

public class Client {
    public static void main(String[] args) {
        ToyDuck toyDuck=new ToyDuck();
        toyDuck.fly();
        toyDuck.quack();
        toyDuck.display();
    }
}
