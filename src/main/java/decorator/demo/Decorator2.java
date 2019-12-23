package decorator.demo;

public class Decorator2 extends Decorator {
    public Decorator2(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addFunction();
    }

    public void addFunction() {
        System.out.println("具体装饰addFunction2");
    }

}
