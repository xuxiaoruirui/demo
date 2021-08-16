package gpstudy.proxy.demo;

import proxy.demo.AbstractSubject;

public class RealSubject2 implements AbstractSubject {
    @Override
    public void request() {
        System.out.println("真实主题 RealSubject2");
    }
}
