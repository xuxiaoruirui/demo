package java8.demo2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test3 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("1","2");
        map.put("2","3");
        map.put("3","4");
        List<Map<String,String>> oldList=new ArrayList<>();
        oldList.add(map);
        List<Map<String,String>> newList=new ArrayList<>();
        newList.addAll(oldList);
        map.put("5","5");
        System.out.println();
    }
}
