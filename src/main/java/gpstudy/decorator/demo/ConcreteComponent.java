package gpstudy.decorator.demo;

import decorator.demo.Component;

public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("具体构件");
    }
}
