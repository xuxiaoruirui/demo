package gpstudy.lock;

import java.util.concurrent.*;

public class DeadLockDemo {
    public void method1() {
        synchronized (String.class) {
            System.out.println(Thread.currentThread().getName()+": method1  String");

            synchronized (Integer.class) {
                System.out.println(Thread.currentThread().getName()+":method1 Integer");
            }
        }
    }

    public void method2() {
        synchronized (Integer.class) {
            System.out.println(Thread.currentThread().getName()+":method2  String");

            synchronized (String.class) {
                System.out.println(Thread.currentThread().getName()+":method2 Integer");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("11111");
        DeadLockDemo deadLockDemo = new DeadLockDemo();
        ExecutorService executorService = Executors.newCachedThreadPool();

        FutureTask<String> f=new FutureTask<String>(()->{
            String a="1";
            return a;
        });
       String res="";
        Future<String> submit = executorService.submit(f, res);
        //submit.get();

        for (int i = 0; i < 5; i++) {

            try {
                executorService.submit(() -> {
                    deadLockDemo.method1();
                });
                executorService.submit(() -> {
                    deadLockDemo.method2();
                });
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        System.out.println("22222");
    }
}
