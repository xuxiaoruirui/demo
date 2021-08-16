package gpstudy.java8.demo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test3 {
    public static void main(String[] args) {
        List<Double> list =null;
        list.stream().filter(a->a>0).forEach(a-> System.out.println(2));
        for (Double d:
                Optional.ofNullable(list).orElse(new ArrayList<>())) {
            System.out.println(d);
        }
       }
}
