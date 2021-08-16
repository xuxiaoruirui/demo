package gpstudy.decorator.demo2;

import decorator.demo2.ConcreteComponent;
import decorator.demo2.Decorator;
import decorator.demo2.Decorator1;
import decorator.demo2.Decorator2;

public class Client {
    public static void main(String[] args) {
        ConcreteComponent component=new ConcreteComponent();
        Decorator d=new Decorator1();
        Decorator d2=new Decorator2();
        d2.Decorator(component);
        d.Decorator(d2);
        d.operation();
    }
}
