package juc.xr;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

public class CallableDemo {

    private void test() {
        Executor executor= command -> {

        };


        FutureTask futureTask=new FutureTask(()-> System.out.println(1),"1");

        try {
            new Thread(futureTask).start();
            System.out.println(futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        CallableDemo callableDemo=new CallableDemo();
        callableDemo.test();
    }

}
