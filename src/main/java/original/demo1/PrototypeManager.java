package original.demo1;

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
