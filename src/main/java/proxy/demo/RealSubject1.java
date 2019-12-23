package proxy.demo;

public class RealSubject1 implements AbstractSubject {
    @Override
    public void request() {
        System.out.println("真实主题 RealSubject1");
    }
}
