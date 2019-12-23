package java8.demo;

import com.alibaba.druid.util.StringUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        List<Apple> apples=new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            Apple apple=new Apple();
            apples.add(apple);
        }
        apples.sort(Comparator.comparing(Apple::getAppleWeight));
        apples.sort(Comparator.comparing(Apple::getAppleWeight).reversed());
        //谓词复合查询：
        Predicate<Apple> predicate=apple-> apple.getAppleWeight()>10;

        predicate.or(apple -> apple.getAppleClassic()>2)
                .and(apple -> StringUtils.equals(apple.getAppleName(),"优质苹果"));

        //函数复合
        Function<Apple,Float> f=a->a.getAppleWeight()+1;
        Function<Float,Float> g=a->a*2;
        Function<Apple,Float> h=f.andThen(g);
        Function<Apple,Float> h2= g.compose(f);

    }
}
