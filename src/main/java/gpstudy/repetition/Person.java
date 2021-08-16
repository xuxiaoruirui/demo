package gpstudy.repetition;

import lombok.Data;

@Data
public class Person {
    public Person(){}
    public Person(String name,Integer age){
        this.name=name;
        this.age=age;
    }
    private String name;
    private Integer age;


}
