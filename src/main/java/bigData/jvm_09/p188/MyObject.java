package bigData.jvm_09.p188;

import java.util.concurrent.atomic.LongAdder;

/**
 * 类加载器
 * 1.方法区,存放类的加载信息，模板
 * 类装载器ClassLoader
 * 负责加载class文件，class文件在文件开头有特定的文件标示，
 * 将class文件字节码内容加载到内存中，并将这些内容转换成方法区
 * 中的运行时数据结构并且ClassLoader只负责class文件的加载，至于她
 * 是否可以运行，则由Execution决定
 * <p>
 * 启动类加载器（Bootstrap） C++,rt.jar直接在启动的时候就加载了
 * 扩展类加载器（Extension）Java
 * 应用程序加载器（AppClassLoader）
 * java也叫系统类加载器
 */
public class MyObject {
    public static void main(String[] args) {
        int a = -2;
        int b = 2;

        System.out.println(a<<2);
        System.out.println(a +":"+ b);
        MyObject myObject = new MyObject();
        System.out.println(myObject.getClass().getClassLoader().getParent().getParent());
        System.out.println(myObject.getClass().getClassLoader().getParent());
        System.out.println(myObject.getClass().getClassLoader());
    }
}
