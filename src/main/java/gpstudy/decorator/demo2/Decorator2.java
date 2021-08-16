package gpstudy.decorator.demo2;

import decorator.demo2.Decorator;

public class Decorator2 extends Decorator{
    @Override
    public void operation() {
        super.operation();
        add();
    }
    public void add(){
        System.out.println("装饰 add Decorator2");
    }
}
