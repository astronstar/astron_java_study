package com.star.test;

public class TestThread
{
    public static void main( String[] args )
    {
       Thread t1 = new Thread(){
            @Override
            public void run() {
                int num = 0;
                while(true){
                    num++;
                    System.out.println("thread1 is running; num:"+num);
                    try {
                        sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread  t2 = new Thread(){
            @Override
            public void run() {
                while(true){
                System.out.println("thread2 is running");
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
         };
        Thread  t3 = new Thread(){
            @Override
            public void run() {
                while(true){
                    System.out.println("thread3 is running");
                    try {
                        sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
        };
        t1.start();
        t2.start();
        t3.start();
      /*  Thread t1 = new Thread(new Runnable() {
            public void run() {
                int num=0;
                while(true){
                    num++;
                    System.out.println("thread1 is running;num is :"+num);
                    //Thread.sleep(1000);
                    try{
                        Thread.sleep(500);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                int num=0;
                while(true){
                    num++;
                    System.out.println("thread2 is running;num is :"+num);
                    try{
                        Thread.sleep(2000);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        });
        t1.start();
        t2.start();*/


    }
}
