package gpstudy.jvm;

/**
 * @author Rui.Xu Email:rui.xu@gshopper.com
 * @since 2021/7/13 13:06
 */
public class Main {

    public static volatile int anInt = 123;

    long aLong = 123456;

    private String string ;


    public int inc() {
      String s= new String("1");
        return this.anInt + 1;
    }

    public static void main(String[] args) {
        System.out.println(Son.class);
    }
}

