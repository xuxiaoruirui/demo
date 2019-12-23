package factory.demo2;

public class Add extends Operation {
    @Override
    public double getResult() {
        return numberA+numberB;
    }
}
