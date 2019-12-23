package decorator.demo2;

public class Decorator2 extends Decorator{
    @Override
    public void operation() {
        super.operation();
        add();
    }
    public void add(){
        System.out.println("装饰 add Decorator2");
    }
}
