package com.qian.school_2023.May.exercise05_10.work.p161_12_2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("a");
        set.add("b");
        set.add("o");

        set.remove("o");
        set.add("u");
        set.add("u");

        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
    }
}
