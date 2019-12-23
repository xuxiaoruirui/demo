package decorator.demo2;

public class Decorator1 extends Decorator{
    @Override
    public void operation() {
        super.operation();
        add();
    }
    public void add(){
        System.out.println("装饰 add Decorator1");
    }
}
