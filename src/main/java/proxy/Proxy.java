package proxy;

/**
 * 代理
 */
public class Proxy implements Subject {
    private RealSubject realSubject;

    @Override
    public void request() {
        prRequest();
        if(realSubject==null){
            realSubject=new RealSubject();

        realSubject.request();
        }
        endRequest();
    }

    private void prRequest(){
        System.out.println("代理前请求");
    }
    private void endRequest(){
        System.out.println("代理前请求");
    }
}
