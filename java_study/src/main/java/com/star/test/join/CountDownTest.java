package com.star.test.join;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017/5/29.
 */
public class CountDownTest {



        static CountDownLatch c = new CountDownLatch(2);

        public static void main(String[] args) throws InterruptedException {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(1);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    c.countDown();
                    System.out.println(2);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    c.countDown();
                }
            }).start();

            c.await(5000, TimeUnit.MILLISECONDS);

            System.out.println("3");
        }


}
