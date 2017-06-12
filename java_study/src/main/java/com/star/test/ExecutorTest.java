package com.star.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Hello world!
 *
 */
public class ExecutorTest
{
    public static void main( String[] args )
    {
        ExecutorService es = Executors.newFixedThreadPool(2);
        for(int i=0;i<10;i++) {
            final int taskID= i;
            es.submit(new Runnable() {
                public void run() {
                    System.out.println("hello star"+taskID);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        es.shutdown();


    }
}
