package com.star.test;

/**
 * Created by Administrator on 2017/5/1.
 */
import java.util.LinkedList;

/**
 * �Զ���Map�������棨��������С��������
 * 1. ��߲�ѯ��Ч��
 */
public class SxtMap002 {
    LinkedList[]  arr  = new LinkedList[9]; //****Map�ĵײ�ṹ���ǣ�����+����ÿ�������Ԫ�ض�Ӧһ��ӵ��ͬһ��Hashֵ��SxtEntry���󣨼�������������С��λ��������ļ��ϣ�����ӵ��ͬһ��Hashֵ����key��ͬ����Ԫ�أ�������һ�������һ�������ٴ������������������Ǵ�������С������С��������װ�������
    int size;
    public void put(Object key,Object value){
        SxtEntry  e = new SxtEntry(key,value);   //�ù��������������һ��Ԫ�أ�����
        int hash = key.hashCode();
        hash = hash<0?-hash:hash;
        int a = hash%arr.length;   //����õ�һ����ֵ
        if(arr[a]==null){
            LinkedList list = new LinkedList();
            arr[a] = list;  //�ڸ�����Ԫ���½���һ������
            list.add(e);
        }else{
            LinkedList list = arr[a];   //������������Ѿ�������һ��������ô�Ȱ����������ȡ�������в���
            for(int i=0;i<list.size();i++){
                SxtEntry e2 = (SxtEntry) list.get(i);   //����LinkedList��get����ȡ�õ�i����㣬Ȼ��ǿ��ת��ΪSexEntry���ͣ���������˼�ֵ�ظ���ֱ�Ӹ���
                if(e2.key.equals(key)){
                    e2.value = value;  //��ֵ�ظ�ֱ�Ӹ��ǣ�
                    return;
                }
            }
            arr[a].add(e);//���û����ֱ�ӵ���LinkedList��add������ӵ�������֮�󼴿�
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
        m.put("����", new String("����"));
        m.put("����", new String("����"));
        String w = (String) m.get("����");
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