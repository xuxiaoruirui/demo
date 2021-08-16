package gpstudy.original.demo1;

import original.demo1.Shape;

public class Square implements Shape {
    @Override
    public Shape clone() {
        original.demo1.Square square=null;
        try {
            square=(original.demo1.Square) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return square;
    }

    @Override
    public void countArea() {
        System.out.println("计算正方形的面积");
    }
}
