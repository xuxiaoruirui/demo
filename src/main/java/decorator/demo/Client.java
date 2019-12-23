package decorator.demo;

public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Component d = new Decorator1(component);
        Component d2 = new Decorator2(d);
        d2.operation();
    }
}
