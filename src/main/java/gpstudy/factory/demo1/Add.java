package gpstudy.factory.demo1;

import factory.demo1.Operation;

public class Add extends Operation{
    @Override
    public double getResult() {
        return numberA+numberB;
    }
}
