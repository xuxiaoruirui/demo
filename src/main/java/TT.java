import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.apache.commons.collections4.MapUtils;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class TT {
    public static void main(String[] args) {
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
        System.out.println(reduce);
    }
}
