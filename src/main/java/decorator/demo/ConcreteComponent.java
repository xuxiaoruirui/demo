package decorator.demo;

public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("具体构件");
    }
}
