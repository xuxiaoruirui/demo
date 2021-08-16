package gpstudy.jvm;

/**
 * final
 *
 * @author Rui.Xu Email:rui.xu@gshopper.com
 * @since 2021/7/30 17:56
 */
public class FinalExample {
    int i; // 普通变量
    final int j ; // final变量
    static FinalExample obj;
    public FinalExample() {
        obj=this;
        try {
            Thread.sleep(10l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 构造函数
        i = 1;
        // 写普通域
        j = 2;
        // 写final域
    }


    public static void writer() {
        // 写线程A执行
        obj = new FinalExample();

    }

    public static void reader() {
        // 读线程B执行
        FinalExample object = obj;
        // 读对象引用
        System.out.println(object.i);
        System.out.println(object.j);
        int a = object.i;
        // 读普通域
        int b = object.j;
        // 读final域
    }

}
