package strategy.test;

public abstract class Duck {
    private Fly fly;
    private Quack quack;

    public Duck() {

    }

    public void setFly(Fly fly) {
        this.fly = fly;
    }

    public void setQuack(Quack quack) {
        this.quack = quack;
    }


    public abstract void display();

    public void quack(){
        quack.quack();
        // System.out.println("鸭子嘎嘎叫~~~");
    }
    public void swim(){
        System.out.println("鸭子会游泳~~~");
    }
    public void fly(){
        fly.fly();
    }
}
