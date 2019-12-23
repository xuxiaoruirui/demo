package factory.demo1;

public class Add extends Operation{
    @Override
    public double getResult() {
        return numberA+numberB;
    }
}
