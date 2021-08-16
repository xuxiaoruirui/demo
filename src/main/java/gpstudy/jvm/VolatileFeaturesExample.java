package gpstudy.jvm;

/**
 * @author Rui.Xu Email:rui.xu@gshopper.com
 * @since 2021/7/30 15:37
 */
public class VolatileFeaturesExample {
   static long vl = 0L; // 64位的long型普通变量

    public static synchronized void set(long l) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //对单个的普通变量的写用同一个锁同步
        vl = l;
    }


    public static synchronized long get() {
        //对单个的普通变量的读用同一个锁同步
        return vl;
    }


    public void getAndIncrement() {
        // 普通方法调用
        long temp = get();
        //调用已同步的读方法 temp += 1L;
        //普通写操作
        set(temp);
        //调用已同步的写方法
    }

    public static void main(String[] args) {
        VolatileFeaturesExample volatileFeaturesExample = new VolatileFeaturesExample();
        VolatileFeaturesExample volatileFeaturesExample2 = new VolatileFeaturesExample();

        new Thread(() -> {
            volatileFeaturesExample.set(100L);
        }).start();


        new Thread(() -> {
            System.out.println(volatileFeaturesExample2.get());
        }).start();

    }
}
