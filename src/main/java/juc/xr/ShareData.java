package juc.xr;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 打印，a 1,b 2,c 3
 */
public class ShareData {
    private int number = 1;
    private Lock lock = new ReentrantLock();
    private Condition c1 = lock.newCondition();
    private Condition c2 = lock.newCondition();
    private Condition c3 = lock.newCondition();

    public void print1() {
        lock.lock();
        try {
            while (number != 1) {
                c1.await();
            }
            for (int i = 0; i < 1; i++) {
                System.out.println(Thread.currentThread().getName() + ":a");
            }
            number = 2;
            c2.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void print2() {
        lock.lock();
        try {
            while (number != 2) {
                c2.await();
            }
            for (int i = 0; i < 2; i++) {
                System.out.println(Thread.currentThread().getName() + ":b");
            }
            number = 3;
            c3.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void print3() {
        lock.lock();
        try {
            while (number != 3) {
                c3.await();
            }
            for (int i = 0; i <3 ; i++) {
                System.out.println(Thread.currentThread().getName()+":c");
            }
            number = 1;
            c1.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ShareData s = new ShareData();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                s.print1();
            }
        }, "A").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                s.print2();
            }
        }, "B").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                s.print3();
            }
        }, "C").start();
    }
}
