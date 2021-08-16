package gpstudy.factory.demo2;

import factory.demo2.Operation;

public class Sub extends Operation {
    @Override
    public double getResult() {
        return numberA-numberB;
    }
}
