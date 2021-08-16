package gpstudy.jvm;

/**
 * volatile
 *
 * @author Rui.Xu Email:rui.xu@gshopper.com
 * @since 2021/7/30 16:13
 */
public class VolatileExample {
    int a = 0;
    volatile boolean flag = false;

    public void writer() {
        a = 1;
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = true;

    }

    public void reader() {
        if (flag) {
            int i = a; // 4 ……
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        VolatileExample volatileExample = new VolatileExample();

        new Thread(() -> {
            volatileExample.writer();
        }).start();


        new Thread(() -> {
            volatileExample.reader();
        }).start();


    }
}
