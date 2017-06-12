package com.star.test;

/**
 * Created by Administrator on 2017/5/21.
 */
public class ObjectInnerTest {
    public static void main(String[] args) {
      new ObjectInnerTest().test();
    }

    public class InnerObj{}

    public  void test(){
        System.out.println(InnerObj.class);
        System.out.println(InnerObj.class.getClass());
        System.out.println(InnerObj.class.getAnnotations());
        System.out.println(InnerObj.class.getCanonicalName());
        System.out.println(InnerObj.class.getClasses());
        System.out.println(InnerObj.class.getClassLoader());
        System.out.println(InnerObj.class.getSuperclass());
        System.out.println(InnerObj.class.getName());
        System.out.println(InnerObj.class.getSimpleName());
        System.out.println(InnerObj.class.getPackage());

    }
}
