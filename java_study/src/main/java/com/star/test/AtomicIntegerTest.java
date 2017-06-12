package com.star.test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Administrator on 2017/5/21.
 */
public class AtomicIntegerTest {
    public int count;
    public synchronized void  increment(){
        count++;
    }

    public static void main(String[] args) {
        AtomicIntegerTest at = new AtomicIntegerTest();
        long start = System.currentTimeMillis();
        for(int i=0;i<1000000;i++){
            at.increment();
        }
        System.out.println(at.count+"");
        long end = System.currentTimeMillis();
        System.out.println("time elapse:"+(end -start));

        long start1 = System.currentTimeMillis();
        AtomicInteger ato =new AtomicInteger();
        for(int i=0;i<1000000;i++){
            ato.getAndIncrement();
        }
        System.out.println(at.count+"");
        long end1 = System.currentTimeMillis();
        System.out.println("time elapse:"+(end1 -start1));


    }
}
