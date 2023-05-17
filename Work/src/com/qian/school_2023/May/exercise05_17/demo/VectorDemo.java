package com.qian.school_2023.May.exercise05_17.demo;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector v1 = new Vector();

        v1.add(100);
        v1.add("中国");
        v1.add('a');

        System.out.println(v1);

        for (Object o : v1) {
            System.out.println(o);
        }
    }
}
