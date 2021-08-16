package gpstudy.original.demo1;

import original.demo1.Circle;
import original.demo1.Shape;
import original.demo1.Square;

import java.util.HashMap;
import java.util.Map;

public class PrototypeManager {
    private Map<String,Shape> hp=new HashMap<>();
    PrototypeManager(){
        hp.put("circle",new Circle());
        hp.put("shape",new Square());
    }
    public void add(String key,Shape shape){
        hp.put(key,shape);
    }
    public Shape get(String key){
        return hp.get(key);
    }
}
