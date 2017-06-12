package com.star.test;
import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

public class TestCache{

    LoadingCache<String, String> testCache =CacheBuilder.newBuilder()
            .expireAfterWrite(1, TimeUnit.SECONDS)// 缓存1秒
            .maximumSize(1000)// 最多缓存1000个对象
            .build(new CacheLoader<String, String>() {

                public String load(String key) throws Exception {
                    if(key.equals("hi")){
                        return null;
                    }
                    System.out.println("getValue from db");
                    return key+"-world";
                }
            });

    public void test2(TestCache tc) throws Exception {
        //存放缓存
        tc.testCache.put("jd", "beijing");
        //获取缓存，缓存jd已经存在
        System.out.println(tc.testCache.get("jd"));
        Thread.sleep(100000);
        tc.testCache.put("jd", "chengdu");
        System.out.println(tc.testCache.get("jd"));
        while(true) {
            System.out.println(new Date()+":"+tc.testCache.get("jd"));
            //System.out.println(tc.testCache.stats());
            Thread.sleep(50);
        }
    }

    public void test3(TestCache tc) throws Exception {
        //存放缓存
        tc.testCache.put("jd", "beijing");
        //获取缓存，缓存jd已经存在
        System.out.println(tc.testCache.size());
        System.out.println(tc.testCache.stats());


    }

    public void test4(TestCache tc) throws Exception {

        while(true) {
            System.out.println(new Date());
        }
    }



    public static void main(String[] args){
        TestCache tc = new TestCache();
        try{
            tc.test4(tc);
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public void test1(TestCache tc){
        System.out.println(tc.testCache.getIfPresent("hello"));//null
        tc.testCache.put("123", "nana");//存放缓存
        System.out.println(tc.testCache.getIfPresent("123"));//nana
        try {
            System.out.println(tc.testCache.get("hello"));//hello-world
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println(tc.testCache.getIfPresent("hello"));//hello-world
        /***********测试null*************/
        System.out.println(tc.testCache.getIfPresent("hi"));//null
        try {
            System.out.println(tc.testCache.get("hi"));//抛异常
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}