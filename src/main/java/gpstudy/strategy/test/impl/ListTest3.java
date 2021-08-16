package gpstudy.strategy.test.impl;

import java.util.ArrayList;
import java.util.List;

public class ListTest3 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student s1 = new Student();
        s1.setId(1);
        s1.setName("张三");
        s1.setAge(28);

        Student s2 = new Student();
        s2.setId(2);
        s2.setName("李四");
        s2.setAge(29);

        Student s3 = new Student();
        s3.setId(3);
        s3.setName("网二");
        s3.setAge(30);
        Student s4 = new Student();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.println("=========第一种方式================");
        int suma = list.stream().map(e -> e.getAge()).reduce(Integer::sum).get();//求和
        System.out.println(suma);
        int maxa = list.stream().map(e -> e.getAge()).reduce(Integer::max).get();//最大
        System.out.println(maxa);
        int mina = list.stream().map(e -> e.getAge()).reduce(Integer::min).get();//最小
        System.out.println(mina);

        System.out.println("=========第二种方式================");

        double doublesum = list.stream().mapToDouble(Student::getAge).sum();//和
        System.out.println(doublesum);
        int intmax = list.stream().mapToInt(Student::getAge).max().getAsInt();//最大
        System.out.println(intmax);
        int intmin = list.stream().mapToInt(Student::getAge).min().getAsInt();//最小
        System.out.println(intmin);
        double avg = list.stream().mapToDouble(Student::getAge).average().getAsDouble();//平均
        System.out.println(avg);

        System.out.println(false||true&&true);


    }
}