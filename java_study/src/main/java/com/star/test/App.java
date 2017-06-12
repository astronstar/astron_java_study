package com.star.test;

import java.lang.reflect.Method;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String  a = null;
        System.out.println(a+"----");
        System.out.println( "Hello World!" );
        try {
            Class a1  = Class.forName("java.util.ArrayList");

            Method[] mList = a1.getMethods();
            for(Method m : mList){
                System.out.println(m);
            }
            List  list = (List)a1.newInstance();
            list.add("jd");
            list.add("baidu");
            System.out.println(list.size());
        }catch(Exception e){
            e.printStackTrace();
        }
      /*  try {
            Class clazz = Class.forName(path);

            //获取类的名字
            System.out.println(clazz.getName());//获得包名+类名：com.bjsxt.test.bean.User
            System.out.println(clazz.getSimpleName());	//获的类名：User

            //获取属性信息
//			Field[] fields = clazz.getFields(); //只能获得public的field
            Field[] fields = clazz.getDeclaredFields();//获得所有的field
            Field f = clazz.getDeclaredField("uname");
            System.out.println(fields.length);
            for(Field temp:fields){
                System.out.println("属性："+temp);
            }
            //获取方法信息
            Method[] methods = clazz.getDeclaredMethods();
            Method m01 = clazz.getDeclaredMethod("getUname", null);
            //如果方法有参，则必须传递参数类型对应的class对象
            Method m02 = clazz.getDeclaredMethod("setUname", String.class);
            for(Method m:methods){
                System.out.println("方法："+m);
            }

            //获得构造器信息
            Constructor[] constructors = clazz.getDeclaredConstructors();
            Constructor c = clazz.getDeclaredConstructor(int.class,int.class,String.class);
            System.out.println("获得构造器："+c);
            for(Constructor temp:constructors){
                System.out.println("构造器："+temp);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }*/



    }
}
