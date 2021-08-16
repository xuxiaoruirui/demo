package gpstudy.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 线程方法
 *
 * @author Rui.Xu Email:rui.xu@gshopper.com
 * @since 2021/7/5 10:53
 */
public class T1 {
    ThreadLocal<Integer> threadLocal=new ThreadLocal<>();
    public void t1() {
        threadLocal.set(3);
        //线程和任务一一起
        Thread t1 = new Thread("t1") {
            @Override
            public void run() {
                threadLocal.set(1);

                System.out.println( threadLocal.get());
            }
        };
        t1.start();

        //线程和任务任务分开
        Thread t2 = new Thread(() -> {
            threadLocal.set(2);
            System.out.println( threadLocal.get());
        });
        t2.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //有响应的任务
        FutureTask<String> futureTask = new FutureTask<>(() -> "t3");
        new Thread(new FutureTask<>(() -> "t3")).start();
        try {
            String s = futureTask.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }


}
