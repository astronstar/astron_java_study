package com.star.test;

import java.util.Date;

/**
 * Created by Administrator on 2017/5/1.
 */
public class StaticTest {
    static{
        new Thread(new Runnable() {
            public void run() {
                while(true){
                    System.out.println(new Date());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

    }


}
