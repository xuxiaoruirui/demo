package gpstudy.original.demo1;

import original.demo1.PrototypeManager;
import original.demo1.Shape;

public class Client {
    public static void main(String[] args) {
        PrototypeManager p=new PrototypeManager();
        Shape obj1=p.get("circle");
        p.add("circle2",obj1.clone());
        obj1.countArea();
        Shape obj2=p.get("shape");
        obj2.countArea();
    }
}
