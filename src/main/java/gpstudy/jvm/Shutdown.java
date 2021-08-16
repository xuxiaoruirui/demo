package gpstudy.jvm;

import java.util.concurrent.TimeUnit;

/**
 * 线程的中断
 *
 * @author Rui.Xu Email:rui.xu@gshopper.com
 * @since 2021/8/2 14:21
 */
public class Shutdown {
    public static void main(String[] args) throws Exception {
        Runner one = new Runner();
        Thread countThread = new Thread(one, "CountThread");

        countThread.start();
        countThread.interrupt();
        countThread.isInterrupted();
        countThread.wait(1);


        countThread.join(3);
        // 睡眠1秒，main线程对CountThread进行中断，使CountThread能够感知中断而结束
        Thread.sleep(1);
        TimeUnit.SECONDS.sleep(1);
        countThread.interrupt();
        Runner two = new Runner();
        countThread = new Thread(two, "CountThread");

        countThread.start();
        // 睡眠1秒，main线程对Runner two进行取消，使CountThread能够感知on为false而结束
        TimeUnit.SECONDS.sleep(1);
        two.cancel();
    }

    private static class Runner implements Runnable {
        private long i;
        private volatile boolean on = true;

        @Override
        public void run() {
            while (on && !Thread.currentThread().isInterrupted()) {
                i++;
            }
            System.out.println("Count i = " + i);
        }

        public void cancel() {
            on = false;
        }
    }
}
