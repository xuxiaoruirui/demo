package gpstudy.abs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
       /* AbsFather son = new Son();
        son.t2();*/
        List<Map<String, Object>> data = null;
        Optional.ofNullable(data).orElse(new ArrayList<>()).stream().collect(Collectors.toList());
        te();
    }


    static BiConsumer<Integer, Integer> biConsumer = (a, b) -> {
        System.out.println(a + b);
    };

    public static void te() {
        //System.out.println(doubleToLongFunction.applyAsLong(2));
        biConsumer.accept(1, 1);
        //biConsumer.andThen(biConsumer);
    }
}
