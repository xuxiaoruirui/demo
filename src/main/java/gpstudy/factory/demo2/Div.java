package gpstudy.factory.demo2;

import factory.demo2.Operation;

public class Div extends Operation {
    @Override
    public double getResult() {
        return numberA/numberB;
    }
}
