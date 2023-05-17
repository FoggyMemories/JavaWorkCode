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

        ListIterator li = list.listIterator();
        System.out.println("list集合:");
        while (li.hasNext()){
            System.out.print(li.next() + " ");
        }

        System.out.println();

        System.out.println("list集合反向遍历元素:");
        while (li.hasPrevious()){
            System.out.print(li.previous() + " ");
        }
    }
}
