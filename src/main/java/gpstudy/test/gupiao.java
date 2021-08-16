package gpstudy.test;

import com.alibaba.fastjson.JSON;

import java.util.List;
import java.util.stream.Collectors;

public class gupiao {

    private static void t1(List<String> strings){
        String collect = strings.stream().filter(s -> s.contains("_")).map(string -> {
            String[] s = string.split("_");
            String o = "";
            if (s.length > 1) {
                o = s[1];
            } else {
                o = s[0];
            }
            return o;
        }).collect(Collectors.joining(","));
        System.out.println(collect);
    }

    public static void main(String[] args) {
      /*  List<String> strings=new ArrayList<>();
        strings.add("1_1");
        strings.add("2");
        t1(strings);*/
        System.out.println(JSON.toJSONString(null));
      Integer a=1234567891;
    }

}
