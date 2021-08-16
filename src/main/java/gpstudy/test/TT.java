package gpstudy.test;

import com.alibaba.druid.util.StringUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TT {

    public static void test(HashMap map) {
        map= test();
        System.out.println("1");
    }
    public static HashMap  test() {
        HashMap hashMap = new HashMap();
        hashMap.put(null,"1");
        return hashMap;
    }
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        test(hashMap);//1

        String goodsVideo = null;
        if(!StringUtils.isEmpty(goodsVideo)){
            String[] split = goodsVideo.split("/");
            int length = split.length;
            if(length==0||!split[split.length-1].contains(".")){
                System.out.println("null");
            }
        }
        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        map.put("test", "11");
        Map<String, String> map1 = new HashMap<>();
        map1.put("test", "11");
        Map<String, String> map2 = new HashMap<>();
        map2.put("test", "14");
        list.add(map);
        list.add(map1);
        list.add(map2);
        //String aa="{test:11}";
       // List<Map<String, String>> lists =  JSON.parseObject( aa, new TypeReference<List<Map<String, String>>>() {});

      /*  Double d = list.stream()
                .map(a -> Double.parseDouble(a.get("test")))
                .reduce((a, b) -> a + b).get();*/

        /*BigDecimal d = list.stream()
                .map(a -> new BigDecimal(a.get("test")))
                .reduce((a, b) -> a + b).get();*/
       // Double.toString(MapUtils.getDouble(a, "test") * 100 / reduce)
        BigDecimal reduce = list.stream().map(a -> new BigDecimal(a.get("test"))).reduce( BigDecimal.ZERO, BigDecimal::add);
        list.stream()
                .map(a ->
                {  int index= list.indexOf(a);
                        a.put("proportion",new BigDecimal(a.get("test"))
                                .multiply(new BigDecimal("100"))
                                .divide(reduce,2,BigDecimal.ROUND_HALF_UP).toEngineeringString());
                   a.put("index",index+1+"");
                return index;}
                ).collect(Collectors.toList());


        List l=new ArrayList();
        int listSize=list.size();
        int size=1;
        int pageSize=2;
        int fromIndex=size*pageSize;
        int toIndex=(size+1)*(pageSize);
        if(listSize>fromIndex){
            l.addAll(list.subList(fromIndex,toIndex<listSize?toIndex:listSize));
          //  return Collections.EMPTY_LIST;
        }
        //size pagsize
        String a="";
        String b="12";
        StringBuilder order_origin_sn=new StringBuilder();
        order_origin_sn.append(",");
        if(!(order_origin_sn == null || order_origin_sn.length() == 0)){
            order_origin_sn.deleteCharAt(order_origin_sn.length()-1);
            System.out.println(order_origin_sn.toString());
        }
        System.out.println(a.concat(b));
    }
}
