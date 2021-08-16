package gpstudy.strategy.test.factory;

import strategy.test.factory.Computer;

public class DIYComputer extends Computer{
    @Override
    void show() {
        System.out.println("this DIYComputer");
    }
}
