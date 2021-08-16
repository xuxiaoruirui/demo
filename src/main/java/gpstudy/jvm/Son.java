package gpstudy.jvm;

/**
 * @author Rui.Xu Email:rui.xu@gshopper.com
 * @since 2021/7/23 9:59
 */
public class Son extends P {

    public static final int[] i;

    static{
        i = new int[]{1};
    }

    static {
        System.out.println("s");
    }

    public static int value;


    public static int s(int i) {
        int i1;
        try {
            i1 = 1 / i;
            return i1;
        } catch (Exception e) {
            i1 = 10;
            return i1;
        } finally {
            i1 = 100;
            return i1;
        }
    }

    public static void main(String[] args) {
        System.out.println(P.a);
        System.out.println(s(100));
    }
}
