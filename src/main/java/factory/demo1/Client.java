package factory.demo1;

/**
 * 简单工厂方法
 */
public class Client {
    public static void main(String[] args) {
        Operation op=OperationFactory.createOperation("*");
        op.numberA=10;
        op.numberB=10;
        System.out.println(op.getResult());
    }
}
