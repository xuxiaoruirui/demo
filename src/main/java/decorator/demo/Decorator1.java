package decorator.demo;

public class Decorator1 extends Decorator {
    public Decorator1(Component component) {
        super(component);
    }
    @Override
    public void operation() {
        super.operation();
        addFunction();
    }

    public void addFunction() {
        System.out.println("具体装饰addFunction1");
    }

}
