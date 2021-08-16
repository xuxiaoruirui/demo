package gpstudy.original.demo1;

import original.demo1.Shape;

public class Circle implements Shape {
    @Override
    public Shape clone() {
        original.demo1.Circle circle=null;
        try {
            circle= (original.demo1.Circle)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return circle;
    }

    @Override
    public void countArea() {
        System.out.println("计算圆形的面积");
    }
}
