package com.qian.school_2023.May.exercise05_17.demo;

import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ListDemo {
    public static void main(String[] args) {
        List list =  new Vector();

        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        for (int i = 0; i < 3; i++) {
            list.add(i * 10);
        }

        ListIterator lit = list.listIterator();

        while (lit.hasNext()){
            System.out.print(lit.next() + " ");
        }

        System.out.println();

        System.out.println(list);
    }
}
