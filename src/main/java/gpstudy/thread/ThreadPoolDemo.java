package gpstudy.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author Rui.Xu Email:rui.xu@gshopper.com
 * @since 2021/8/6 11:14
 */
public class ThreadPoolDemo {
    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 3, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(3));
}
