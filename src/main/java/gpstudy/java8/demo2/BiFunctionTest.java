package gpstudy.java8.demo2;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * 代表了一个接受两个输入参数的方法，并且返回一个结果
 * andThen 传入一个方法
 */
public class BiFunctionTest {
    private static BiFunction<Integer,Integer,Integer> biFunction=(a,b)-> a+b;

    public static void main(String[] args) {
        Function<Number,Integer> biFunction1=a->a.intValue();
        System.out.println(biFunction.andThen(biFunction1).apply(2,2));
    }

}
