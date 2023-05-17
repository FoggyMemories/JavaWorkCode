package com.qian.school_2023.May.exercise05_17.demo;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Consumer;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        Collections.addAll(ll, "中国", "美国", "日本");

        System.out.println(ll);

        for (String s : ll) {
            System.out.print(s + " ");
        }

        System.out.println();

        ll.forEach(s -> System.out.print(s + " "));

        System.out.println();

        Iterator<String> it = ll.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        ll.remove(2);

        System.out.println();

        System.out.println("删除最后一个元素后的集合:");
        Iterator<String> it1 = ll.iterator();

        while (it1.hasNext()){
            System.out.print(it1.next() + " ");
        }
    }
}
