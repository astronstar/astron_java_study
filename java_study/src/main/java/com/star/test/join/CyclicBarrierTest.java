package com.star.test.join;

import java.util.concurrent.CyclicBarrier;

/**
 * Created by Administrator on 2017/5/29.
 */
public class CyclicBarrierTest {

    static CyclicBarrier c = new CyclicBarrier(2);

    public static void main(String[] args) {
        new Thread(new Runnable() {

            @Override
            public void run() {
                try {

                    System.out.println("1:"+c.getNumberWaiting());
                    c.await();
                    c.reset();
                    System.out.println("2:"+c.getNumberWaiting());
                    c.await();
                    System.out.println("3:"+c.getNumberWaiting());

                } catch (Exception e) {

                }
                System.out.println(1);
            }
        }).start();

        try {
            System.out.println("0:"+c.getNumberWaiting());

           /* Thread.sleep(2000);
            c.await();
            c.reset();*/
            Thread.sleep(1000);
            System.out.println("4:"+c.getNumberWaiting());

        } catch (Exception e) {

        }
        System.out.println(3);
    }
}