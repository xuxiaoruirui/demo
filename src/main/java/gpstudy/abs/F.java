package gpstudy.abs;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * author Rui.Xu
 * 方法返回值有多个参数
 */
public class F {
    @Setter
    @ToString
    @AllArgsConstructor
    public static class Tuple<A,B>{
        public A _1;
        public B _2;
    }
    public static <A,B> Tuple<A,B> Tuple(A a,B b){
        return new Tuple<>(a,b);
    }

    @Setter
    @ToString
    @AllArgsConstructor
    public static class Tuple3<A,B,C>{
        public A _1;
        public B _2;
        public C _3;
    }
    public static <A,B,C> Tuple3<A,B,C> Tuple(A a, B b,C c){
        return new Tuple3<>(a,b,c);
    }
}
