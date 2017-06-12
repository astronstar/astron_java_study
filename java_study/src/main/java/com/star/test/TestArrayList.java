package com.star.test;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by Administrator on 2016/10/3.
 */
public class TestArrayList {
    public static void main( String[] args )
    {
        Joiner joiner = Joiner.on("; ").skipNulls();
        String ji = joiner.join("jd1", null, "jd2", "jd3");

        List<String> list = Lists.newArrayList("a", "b", "c", "d");
        System.out.println( list.size() );
    }



}
