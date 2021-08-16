package gpstudy.proxy;

import proxy.Subject;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("RealSubject 真实请求");
    }
}
