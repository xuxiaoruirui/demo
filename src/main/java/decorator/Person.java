package decorator;

import java.io.Console;

/**
 * 装饰着模式
 */
public class Person {
    private String name;
    Person(){}
    public Person(String name ){
        this.name=name;
    }
    public  void show(){
        System.out.print(" 装扮着{"+name+"}");
    }
}
