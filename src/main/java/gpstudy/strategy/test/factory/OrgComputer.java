package gpstudy.strategy.test.factory;

import strategy.test.factory.Computer;

public class OrgComputer extends Computer {
    @Override
    void show() {
        System.out.println("this ORG Computer");
    }
}
