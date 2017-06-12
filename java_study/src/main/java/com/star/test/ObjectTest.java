package com.star.test;

/**
 * Created by Administrator on 2017/5/21.
 */
public class ObjectTest {
    public static void main(String[] args) {
      new ObjectTest().test();
    }

   // public class innerObj{}

    public  void test(){
        System.out.println(getClass());
        System.out.println(getClass().getAnnotations());
        System.out.println(getClass().getCanonicalName());
        System.out.println(getClass().getClasses());
        System.out.println(getClass().getClassLoader());
        System.out.println(getClass().getSuperclass());
        System.out.println(getClass().getName());
        System.out.println(getClass().getSimpleName());
        System.out.println(getClass().getPackage());

    }
}
