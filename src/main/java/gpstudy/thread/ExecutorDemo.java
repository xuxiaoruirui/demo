package gpstudy.thread;

import java.util.concurrent.*;

/**
 * @author Rui.Xu Email:rui.xu@gshopper.com
 * @since 2021/8/6 13:28
 */
public class ExecutorDemo {
    public static void main(String[] args) {

        //固定线程池FixedThreadPool适用于为了满足资源管理的需求，
        //而需要限制当前线程数量的应用场景，它适用于负载比较重的服务器。
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(1);

        //单线程SingleThreadExecutor适用于需要保证顺序地执行各个任务；
        //并且在任意时间点，不会有多 个线程是活动的应用场景
        ExecutorService singleThreadPool = Executors.newSingleThreadExecutor();

        //大小无界的线程池，CachedThreadPool是大小无界的线程池，
        //适用于执行很多的短期异步任务的小程序，
        //或者 是负载较轻的服务器。
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

        //ScheduledThreadPoolExecutor适用于需要多个后台线程执行周期任务，
        //同时为了满足资源 管理的需求而需要限制后台线程的数量的应用场景。
        //下面是Executors提供的，创建单个线程 的SingleThreadScheduledExecutor的API
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

        //SingleThreadScheduledExecutor适用于需要单个后台线程执行周期任务，同时需要保证顺 序地执行各个任务的应用场景。
        ScheduledExecutorService singleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();

        //除了可以自己创建实现Callable接口的对象外，还可以使用工厂类Executors来把一个 Runnable包装成一个Callable
        Callable<Object> callable = Executors.callable(() -> {},"");

    }
}
