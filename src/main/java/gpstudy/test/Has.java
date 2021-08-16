package gpstudy.test;

import java.math.BigDecimal;
import java.util.*;

public class Has {
    private static class Person{
        int idCard;
        String name;

        public Person(int idCard, String name) {
            this.idCard = idCard;
            this.name = name;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()){
                return false;
            }
            Person person = (Person) o;
            //两个对象是否等值，通过idCard来确定
            return this.idCard == person.idCard;
        }

        @Override
        public int hashCode() {
            return Integer.valueOf(this.idCard).hashCode();
        }
    }
    public static void main(String []args){

        Double payPrice=new Double(76.99);
        int i1 = payPrice.intValue();
        int amount =  new BigDecimal(payPrice).multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP).intValue();
        String totFee =  new BigDecimal(payPrice).multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP).toString();
        HashMap<Person,String> map = new HashMap<Person, String>();
        Collection connection= new ArrayList<>();
        Hashtable<Person,String> map1 = new Hashtable();

        Person person = new Person(1234,"乔峰");
        //put到hashmap中去
        map.put(person,"天龙八部");
        //get取出，从逻辑上讲应该能输出“天龙八部”
        System.out.println("结果:"+map.get(new Person(1234,"萧峰")));
        BigDecimal conPrice = new BigDecimal(11);
        BigDecimal disPrice= new BigDecimal(11);
        int i = conPrice.compareTo(disPrice);
        System.out.println(i);

        Set<String> set=new HashSet<>();
        Set<String> set1=new HashSet<>();
        Set<String> set2=new HashSet<>();
        set1.add("1");
        set1.add("2");
        set2.add("2");
        set2.add("3");
        set.addAll(set1);
        set.addAll(set2);
        System.out.println(set);

    }
}
