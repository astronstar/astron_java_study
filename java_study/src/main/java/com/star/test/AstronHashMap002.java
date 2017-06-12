package com.star.test;


import java.util.LinkedList;

public class AstronHashMap002 {
    int arrayLength = 9;
    LinkedList[] ae = new LinkedList[arrayLength];
    int size;
    public void put(Object key,Object value){
        AstronEntry newElements= new AstronEntry(key,value);
        int hash =  key.hashCode();
        hash =hash<0?-hash:hash;
        int index = hash%arrayLength;
        //检查是否有重复的key
        if(ae[index]==null){
            ae[index]= new LinkedList();
        }else{
            LinkedList ll= ae[index];
            for(int i=0;i<ll.size();i++){
                AstronEntry ae = (AstronEntry)ll.get(i);
                if(ae.key.equals(key)){
                    ll.set(i,newElements);
                    return;
                }
            }
        }
        ae[index].add(newElements);
    }

    public Object get(Object key){
        int hash =  key.hashCode();
        hash =hash<0?-hash:hash;
        int index = hash%arrayLength;
        if(ae[index]!=null){
            LinkedList ll= ae[index];
            for(int i=0;i<ll.size();i++){
                AstronEntry ae = (AstronEntry)ll.get(i);
                if(ae.key.equals(key)) {
                    return ae.value;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        AstronHashMap002 am = new AstronHashMap002();
        am.put("astron","test");
        am.put("astron","test1");

        if (am.get("star") != null) {
            System.out.println(am.get("star"));
        }
      //
        System.out.println(am.get("astron"));
    }



    public class AstronEntry {
        Object key;
        Object value;

        public AstronEntry(Object key, Object value) {
            super();
            this.key = key;
            this.value = value;
        }

    }

}
