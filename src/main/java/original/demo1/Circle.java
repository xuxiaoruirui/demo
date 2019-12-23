package original.demo1;

public class Circle implements Shape {
    @Override
    public Shape clone() {
        Circle circle=null;
        try {
            circle= (Circle)super.clone();
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
