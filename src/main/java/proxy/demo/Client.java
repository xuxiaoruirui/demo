package proxy.demo;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        AbstractSubject subject=null;
        InvocationHandler handler=null;
        handler=new DynamicProxy(new RealSubject1());
        subject=(AbstractSubject) Proxy.newProxyInstance(
                AbstractSubject.class.getClassLoader(),
                new Class[]{AbstractSubject.class},
                handler);
        subject.request();
        System.out.println("1");
    }
}
