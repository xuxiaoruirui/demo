package gpstudy.generics;

import generics.Generator;
import generics.Generic;

public class FruitGenerator<T> implements Generator<T> {
    @Override
    public T next() {
        return null;
    }
    public static void showKeyValue1(Generic<? super Integer> obj){
        System.out.println("泛型测试 key value is " + obj.getKey());
    }
    public void test(){
        Generic<Integer> generator=new Generic<Integer>(2222);
        Generic<Number> genera=new Generic<Number>(1111);
      /*  showKeyValue1(generator);
        showKeyValue1();*/

        showKeyValue1(genera);
        showKeyValue1(generator);
    }

    public static void main(String[] args) {
        generics.FruitGenerator f=new generics.FruitGenerator();
        f.test();
    }
}
