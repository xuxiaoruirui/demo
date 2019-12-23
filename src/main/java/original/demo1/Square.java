package original.demo1;

public class Square implements Shape {
    @Override
    public Shape clone() {
        Square square=null;
        try {
            square=(Square) super.clone();
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
