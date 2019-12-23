package factory.demo2;

public class AddFactory extends OperationFactory {
    @Override
    public Operation createOperation() {
        return new Add();
    }
}
