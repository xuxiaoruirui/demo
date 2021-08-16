package juc.xr;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPoolDemo {

    final static ExecutorService executor = Executors.newCachedThreadPool();

    public static void main(String[] args) throws Exception {

        Future<String> future = executor.submit(() -> "SUCCESS");

        FutureTask<String> futureTask=new FutureTask<>(()-> "SUCCESS");
        Thread thread = new Thread(futureTask);
        thread.start();
        futureTask.get();

        FutureTask<String> futureTask1=new FutureTask<>(()-> "SUCCESS");
        Future future1 = executor.submit(futureTask1);
        future1.get();
    }
}
