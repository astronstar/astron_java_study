package com.star.test.join;

/**
 * Created by Administrator on 2017/5/29.
 */
public class JoinTest {

    public static void main(String[] args) throws InterruptedException {
        Thread parser1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("parser1 finish");
            }
        });

        Thread parser2 = new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("parser2 finish");
            }
        });

        parser1.start();
        parser2.start();
        parser1.join(6000);
        parser2.join(6000);
        System.out.println("all parser finish");
    }

}
