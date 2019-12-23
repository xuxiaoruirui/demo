package factory.demo1;

public class Sub extends Operation{
    @Override
    public double getResult() {
        return numberA-numberB;
    }
}
