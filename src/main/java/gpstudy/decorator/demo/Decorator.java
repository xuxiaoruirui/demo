package gpstudy.decorator.demo;

import decorator.demo.Component;

public class Decorator implements Component {

    private Component component;

   public Decorator(Component component){
       this.component=component;
   }

   @Override
    public void operation() {
        component.operation();
    }

}
