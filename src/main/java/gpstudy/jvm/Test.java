package gpstudy.jvm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Rui.Xu Email:rui.xu@gshopper.com
 * @since 2021/7/23 16:55
 */
class Test {
    class GrandFather {
        void thinking() {
            System.out.println("i am grandfather");
        }
    }

    class Father extends GrandFather {
        void thinking() {
            System.out.println("i am father");
        }
    }
    class T extends LinkedHashMap{
        @Override
        public boolean removeEldestEntry(Map.Entry eldest) {
            return false;
        }
    }

    class Son extends Father {

        void thinking() {
            // 请读者在这里填入适当的代码（不能修改其他地方的代码）
            //实现调用祖父类的thinking()方法，打印"i am grandfather"
          /*  try {
                MethodType mt = MethodType.methodType(void.class);
                MethodHandle mh = lookup().findSpecial(GrandFather.class, "thinking", mt, getClass());
                mh.invoke(this);
            } catch (Throwable e) {
            }*/
            try {
                HashMap hashMap = new HashMap();
                Hashtable  hashTable = new Hashtable();

                LinkedHashMap linkedHashMap = new LinkedHashMap() {

                    @Override
                    public boolean removeEldestEntry(Map.Entry eldest) {
                        return false;
                    }
                };
                new LinkedHashMap() {

                    @Override
                    public boolean removeEldestEntry(Map.Entry eldest) {
                        return false;
                    }
                }.removeEldestEntry(null);

                MethodType mt = MethodType.methodType(void.class);
                Field lookupImpl = MethodHandles.Lookup.class.getDeclaredField("IMPL_LOOKUP");
                lookupImpl.setAccessible(true);
                MethodHandle mh = ((MethodHandles.Lookup) lookupImpl.get(null)).findSpecial(GrandFather.class, "thinking", mt, GrandFather.class);
                mh.invoke(this);
            } catch (Throwable e) {
            }
        }
    }

    public static void main(String[] args) {
       T t = new Test().new T();
       // t.removeEldestEntry();
        System.out.println(P.a);
        /*(new Test().new Son()).thinking();*/
        new Thread(() -> {
            FinalExample.writer();
        }).start();
        new Thread(() -> {
            FinalExample.reader();
        }).start();
        ;
        ;
    }
}
