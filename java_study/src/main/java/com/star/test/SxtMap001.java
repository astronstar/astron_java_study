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
 //�����ֵ�ظ��Ĵ���
 for(int i=0;i<size;i++){
 if(arr[i].key.equals(key)){
 arr[i].value=value;   //���µ�valueֵȥ�����ϵ�valueֵ
 return ;
 }
 }
 arr[size++] = e;
 }
 public Object get(Object key){
 for(int i=0;i<size;i++){
 if(arr[i].key.equals(key)){
 return arr[i].value;   //�ҵ��˾ʹ�ֹͣ�÷�����ִ�У�������Ӧvalue
 }
 }
 return null;   //û���ҵ��ͷ���null
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
 m.put("����", new String("����"));
 m.put("����", new String("����"));
     String w = (String) m.get("����");
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
