package com.star.test;

/**
 * Created by Administrator on 2017/5/1.
 */
import java.util.LinkedList;

/**
 * 自定义Map的升级版（大容器套小容器）：
 * 1. 提高查询的效率
 */
public class SxtMap002 {
    LinkedList[]  arr  = new LinkedList[9]; //****Map的底层结构就是：数组+链表，每个数组的元素对应一组拥有同一个Hash值的SxtEntry对象（即该容器里面最小单位的组件）的集合，对于拥有同一个Hash值（即key相同）的元素，这样的一组对象用一个链表再串起来，看起来就像是大容器套小容器，小容器里面装着组件。
    int size;
    public void put(Object key,Object value){
        SxtEntry  e = new SxtEntry(key,value);   //用构造器构造出这样一个元素（对象）
        int hash = key.hashCode();
        hash = hash<0?-hash:hash;
        int a = hash%arr.length;   //求余得到一个键值
        if(arr[a]==null){
            LinkedList list = new LinkedList();
            arr[a] = list;  //在该数组元素下建立一个链表
            list.add(e);
        }else{
            LinkedList list = arr[a];   //如果该数组下已经建立了一个链表，那么先把这个链表提取出来进行操作
            for(int i=0;i<list.size();i++){
                SxtEntry e2 = (SxtEntry) list.get(i);   //利用LinkedList的get方法取得第i个结点，然后强制转型为SexEntry类型，如果发生了键值重复则直接覆盖
                if(e2.key.equals(key)){
                    e2.value = value;  //键值重复直接覆盖！
                    return;
                }
            }
            arr[a].add(e);//如果没有则直接调用LinkedList的add方法添加到该链表之后即可
        }
        //a:1000-->1   b:10000-->13
    }
    public Object get(Object key){
        int a = key.hashCode()%arr.length;
        if(arr[a]!=null){
            LinkedList list = arr[a];
            for(int i=0;i<list.size();i++){
                SxtEntry e = (SxtEntry) list.get(i);
                if(e.key.equals(key)){
                    return e.value;
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        SxtMap002 m = new SxtMap002();
        m.put("高琪", new String("杨幂"));
        m.put("高琪", new String("李四"));
        String w = (String) m.get("高琪");
        System.out.println(w);
    }

    class  SxtEntry {
        Object key;
        Object value;

        public SxtEntry(Object key, Object value) {
            super();
            this.key = key;
            this.value = value;
        }
    }
}