package gpstudy.decorator.demo2;

import decorator.demo2.ConcreteComponent;

public abstract class Decorator extends ConcreteComponent {
    private ConcreteComponent concreteComponent;
    public void Decorator(ConcreteComponent concreteComponent){
        this.concreteComponent=concreteComponent;
    }
    @Override
    public void operation() {
        concreteComponent.operation();
    }
}
