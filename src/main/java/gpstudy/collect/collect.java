package gpstudy.collect;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class collect {
    public static void main(String[] args) {
        List<Order> list=new ArrayList<>();
        Order order=new Order();
        order.setComeFrom(1);
        order.setOrderType(4);
        Order order1=new Order();
        order1.setOrderType(2);
        Order order2=new Order();
        order2.setOrderType(3);
        list.add(order);
        list.add(order1);
        list.add(order2);
        Map<Integer, List<Order>> collect = list.stream().collect(Collectors.groupingBy(o -> order.getComeFrom()));
        List<Order> collect1 = list.stream().sorted(Comparator.comparing(o -> o.getOrderType())).collect(Collectors.toList());
        System.out.println(collect);

    }
}
