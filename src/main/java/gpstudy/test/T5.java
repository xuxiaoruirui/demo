package gpstudy.test;

import com.alibaba.fastjson.JSONArray;
import strategy.Context;

import java.util.*;

public class T5 {
    public static void main(String[] args) {
        String  adminMessage=null;
        String sellerMessage="11";
        List<Context> list=new ArrayList<>();
        Context context= new Context();
        Context context1= new Context();
        list.add(context);
        list.add(null);
        context.setA("q");
        String s = JSONArray.toJSONString(list);

        System.out.println(s);

        Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;
        System.out.println(f1 == f2);
        System.out.println(f3 == f4);


        int value = 10000000;
        Set<Integer> result =new HashSet<>(value );
        Random random = new Random();
        long a = System.currentTimeMillis();
        while (result.size() < value + 1) {
            int i = random.nextInt(value + 1);
            result.add(i);
        }

    }

}
