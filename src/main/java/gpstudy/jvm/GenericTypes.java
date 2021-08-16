package gpstudy.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rui.Xu Email:rui.xu@gshopper.com
 * @since 2021/7/27 9:38
 */
public class GenericTypes {

   /* public static String method(List<String> list) {
        System.out.println("invoke method(List<String> list)");
        return "";
    }*/

    public static int method(List<Integer> list) {
        System.out.println("invoke method(List<Integer> list)");
        return 1;
    }

    public static void main(String[] args) {
      /*  method(new ArrayList<String>());*/
        method(new ArrayList<Integer>());
    }

}
