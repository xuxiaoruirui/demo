package gpstudy.factory.demo2;

import factory.demo2.Add;
import factory.demo2.Operation;
import factory.demo2.OperationFactory;

public class AddFactory extends OperationFactory {
    @Override
    public Operation createOperation() {
        return new Add();
    }
}
