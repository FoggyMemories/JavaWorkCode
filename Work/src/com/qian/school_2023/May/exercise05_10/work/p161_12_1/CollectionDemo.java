package com.qian.school_2023.May.exercise05_10.work.p161_12_1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> c = new Vector<>();

        c.add("中山大专");
        c.add("计算机学院");
        c.add("Java程序设计");

        Iterator<String> iter = c.iterator();
        while (iter.hasNext()){
            String str = iter.next();
            System.out.println(str);
        }
    }
}
