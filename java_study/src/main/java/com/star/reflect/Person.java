package com.star.reflect;

/**
 * Created by Administrator on 2017/6/4.
 */
public class Person {
    public static String PersonVersion = "1";
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(){

    }
    public Person(String name){
        this(name,28);
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public static void testStatic(){
        System.out.println("这是静态方法");
        System.out.println("test static method");
    }
    public void testPersonMethod(){
        System.out.println("测试对象方法");
        System.out.println("test obj method");
    }
}
