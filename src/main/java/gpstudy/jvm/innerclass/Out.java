package gpstudy.jvm.innerclass;

/**
 * 内部内
 *
 * @author Rui.Xu Email:rui.xu@gshopper.com
 * @since 2021/7/26 14:19
 */
public class Out implements Runnable {
    private static final int i1 = 1;
    private static int i2 = 2;
    private int i3 = 3;

    int test1(int i){
        int ii=12;
        return ii;
    }


    @Override
    public void run() {

    }

    /**
     * 静态内部内
     */
    public static class Inner {
        int i2;

        public void Inner(int a) {
            this.i2 = Out.i2;
        }

        public void inner() {
            System.out.println(i2);
        }

        public static void main(String[] args) {
            System.out.println(i1);
        }
    }

    /**
     * 成员内部类
     */
    public class Inner1 {
        int i2 = 1;
        String s = "";

        public void Inner(int a) {
            this.i2 = Out.this.i3;
        }

    }

    /**
     * 局部内部类
     */
    public void test(final int c) {
        Integer i = new Integer(3);
        class Inner {
            Inner( int c){

            }
            public void print() {

                System.out.println(i);
            }
        }
    }

    /**
     * 匿名内部类
     */
    public void test() {
        int i=Out.this.i3;
        t(new Runnable() {
            @Override
            public void run() {
                System.out.println(i);
            }
        });
        t(new Thread(() -> System.out.println(2)));
    }

    public void t(Runnable runnable) {
        new Thread(runnable).start();
    }

    public void t(Thread thread) {
        thread.start();
    }
}
