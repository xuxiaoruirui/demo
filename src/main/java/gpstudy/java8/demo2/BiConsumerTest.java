package gpstudy.java8.demo2;

import java.util.function.BiConsumer;

/**
 * 代表了一个接受两个输入参数的操作，并且不返回任何结果
 * andThen 使得消费着执行有先后顺序
 */
public class BiConsumerTest {
    private static BiConsumer<StringBuilder, StringBuilder> biConsumer = (a, b) -> {
        a.append(b);
        System.out.println(a);
    };

    public static void main(String[] args) {
        //两个消费着有先后
        BiConsumer<StringBuilder, StringBuilder> biConsumer1 = (a,b)->{b.append(a); System.out.println(b);};
        biConsumer1.andThen(biConsumer).accept(new StringBuilder("你好"), new StringBuilder("小锐锐"));

        biConsumer.andThen(biConsumer1).accept(new StringBuilder("你好"), new StringBuilder("小锐锐"));
        //execCurl(cmds);
    }

}
