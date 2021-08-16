package gpstudy.jvm.innerclass;

/**
 * 测试内部内
 *
 * @author Rui.Xu Email:rui.xu@gshopper.com
 * @since 2021/7/26 14:22
 */
public class Test {
    public static void main(String[] args) {
        Out.Inner inner=new Out.Inner();
        inner.inner();
    }
}
