package com.star.test;

import java.util.Set;
import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;

public class TestBingji {
    public static void main(String[] args) {
        Set<Integer> sets = Sets.newHashSet(1, 2, 3, 4, 5, 6);
        Set<Integer> set2 = Sets.newHashSet(3, 4, 5, 6, 7, 8, 9);
        SetView<Integer> intersection = Sets.intersection(sets, set2);
        for (Integer in : intersection) {
            System.out.print(in + "  ");
        }
        System.out.println();
        SetView<Integer> intersection2 = Sets.difference(set2, sets);
        for (Integer in : intersection2) {
            System.out.print(in + "  ");
        }
        System.out.println();
        SetView<Integer> intersection3 = Sets.union(sets, set2);
        for (Integer in : intersection3) {
            System.out.print(in + "  ");
        }
    }
}

