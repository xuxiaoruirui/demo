package factory.demo2;

/**
 * 工厂方法
 */
public class Client {
    public static void main(String[] args) {
        OperationFactory factory=new AddFactory();
        Operation op= factory.createOperation();
        op.numberA=10;
        op.numberB=10;
        System.out.println(op.getResult());
    }
}
