package gpstudy.jvm;

/**
 * 运行时常量池
 *
 * @author Rui.Xu Email:rui.xu@gshopper.com
 * @since 2021/7/7 10:00
 */
public class T27 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc").intern();
        System.out.println(s1 == s2);

        String str1 = new StringBuilder("计算机").append("软件").toString();

        System.out.println(str1.intern() == str1);

        String str2 = new StringBuilder("ja").append("va").toString();
        String intern = str2.intern();
        String str3="java";
        Object o=new Object();
        T27 objA = new T27();
        System.out.println(intern == str2);

    }

}
