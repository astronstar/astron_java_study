package com.star.test;

import java.util.LinkedList;

/**
 * Created by Administrator on 2017/5/1.
 */
public class HashCodeTest {
    public static void main(String[] args) {
        String s1 = "a1";
        String s2 = "a2";
        int size = 91;
        LinkedList[] list =new LinkedList[size];
        for(int i=0;i<10000000;i++){
            String s = "a"+i;
            int hash = s.hashCode();
            hash = hash<0?-hash:hash;
            //System.out.println(hash%size);
            if(list[hash%size]==null){
                list[hash%size]=new LinkedList();
            }
            list[hash%size].add(s);
        }

        for(int i=0;i<size;i++){
            System.out.println(list[i].size());
        }

    }
}
