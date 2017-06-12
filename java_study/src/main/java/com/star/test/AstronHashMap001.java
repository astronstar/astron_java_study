package com.star.test;


/**
 * Created by Administrator on 2017/5/1.
 */
public class AstronHashMap001 {
    AstronEntry[] ae = new AstronEntry[1024];
    int size;
    public void put(Object key,Object value){
        AstronEntry newElements= new AstronEntry(key,value);
        //检查是否有重复的key
        for(int i=0;i<size;i++){
            if(key.equals(ae[i].key)){
                ae[i].value = value;
                return;
            }
        }
        //如果没有重复的key；
        ae[size++] = newElements;

    }
    public Object get(Object key){
        for(int i=0;i<size;i++){
            if(key.equals( ae[i].key)){
               return ae[i].value;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        AstronHashMap001 am = new AstronHashMap001();
        am.put("astron","test");
        am.put("astron","test1");

        if (am.get("star") != null) {
            System.out.println(am.get("star"));
        }
      //
        System.out.println(am.get("astron"));
    }



/*    public class AstronEntry
    {
        Object key;
        Object value;

        public AstronEntry(Object key, Object value) {
        super();
        this.key = key;
        this.value = value;
    }*/


}
