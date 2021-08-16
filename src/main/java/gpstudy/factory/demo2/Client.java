package gpstudy.factory.demo2;

import factory.demo2.AddFactory;
import factory.demo2.Operation;
import factory.demo2.OperationFactory;

/**
 * 工厂方法
 */
public class Client {
    public static void main(String[] args) {
        OperationFactory factory=new AddFactory();
        Operation op= factory.createOperation();
        op.numberA=10;
        op.numberB=10;
        System.out.println(op.getResult());
    }
}
