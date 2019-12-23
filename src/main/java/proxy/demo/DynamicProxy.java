package proxy.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {
    private Object obj;
    public DynamicProxy( Object obj){
        this.obj=obj;
    }
    @Override
    public Object invoke(Object p, Method m, Object[] args) {
        try {
            m.invoke(obj,args);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
