package proxy.demo;

public class RealSubject2 implements AbstractSubject {
    @Override
    public void request() {
        System.out.println("真实主题 RealSubject2");
    }
}
