package gpstudy.factory.demo1;

import factory.demo1.Add;
import factory.demo1.Div;
import factory.demo1.Mul;
import factory.demo1.Operation;
import factory.demo1.Sub;

public class OperationFactory {
    public static Operation createOperation(String op){
        Operation operation=null;
        switch (op)
        {
            case "+":
                operation=new Add();
                break;
            case "-":
                operation=new Sub();break;
            case "*":
                operation=new Mul();break;
            case "/":
                operation=new Div();break;
        }
        return operation;
    }
}
