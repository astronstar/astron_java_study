package com.star.test;/*
package com.star.test;

*/
/**
 * Created by Administrator on 2017/5/1.
 *//*

 public class SxtMap001 {
 SxtEntry[]  arr  = new SxtEntry[990];
 int size;
 public void put(Object key,Object value){
 SxtEntry e = new SxtEntry(key,value);
 //解决键值重复的处理
 for(int i=0;i<size;i++){
 if(arr[i].key.equals(key)){
 arr[i].value=value;   //用新的value值去覆盖老的value值
 return ;
 }
 }
 arr[size++] = e;
 }
 public Object get(Object key){
 for(int i=0;i<size;i++){
 if(arr[i].key.equals(key)){
 return arr[i].value;   //找到了就此停止该方法的执行，返回相应value
 }
 }
 return null;   //没有找到就返回null
 }
 public boolean containsKey(Object key){
 for(int i=0;i<size;i++){
 if(arr[i].key.equals(key)){
 return true;
 }
 }
 return false;
 }
 public boolean containsValue(Object value){
 for(int i=0;i<size;i++){
 if(arr[i].value.equals(value)){
 return true;
 }
 }
 return false;
 }
 public static void main(String[] args) {
 SxtMap001 m = new SxtMap001();  
 m.put("高琪", new String("杨幂"));
 m.put("高琪", new String("李四"));
     String w = (String) m.get("高琪");
 System.out.println(w);
 }
 }

     class  SxtEntry {
     Object key;
     Object value;
     public SxtEntry(Object key, Object value) {
     super();
     this.key = key;
     this.value = value;
     }
 }*/
