package gpstudy.java8.demo2;

import com.alibaba.druid.util.StringUtils;
import java8.demo.Apple;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        List<Apple> apples=new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            Apple apple=new Apple();
            apples.add(apple);
        }
       /* BiConsumer<StringBuilder, StringBuilder> biConsumer= StringBuilder::append;

        biConsumer.andThen(biConsumer);*/
        //谓词复合查询：
        Predicate<Apple> predicate= apple-> apple.getAppleWeight()>10;

        predicate.or(apple -> apple.getAppleClassic()>2)
                .and(apple -> StringUtils.equals(apple.getAppleName(),"优质苹果"));

        //函数复合
        Function<Apple,Float> f= a->a.getAppleWeight()+1;
        Function<Float,Float> g=a->a*2;
        Function<Apple,Float> h=f.andThen(g);
        Function<Apple,Float> h2= g.compose(f);
        Comparator<Integer> comparator= (x, y) -> Integer.compare(x, y);

        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.sort(comparator);
        //list.stream().mapToDouble(a->a.doubleValue()).collect(Collectors.toMap())
        StringBuilder sb = new StringBuilder();
        BiConsumer<StringBuilder, StringBuilder> biConsumer = (a, b) -> {
            a.append(b);
        };
        //biConsumer.accept("Hello ", "Jack!");

        BiConsumer<StringBuilder, StringBuilder> biConsumer1 = (a, b) -> {
            System.out.println(a);
            System.out.println(b);
        };
        biConsumer.andThen(biConsumer1).accept(new StringBuilder("Hello "), new StringBuilder("Jack! ")); // Hello Jack


       // System.out.println(sb.toString());

    }
}
