package com.qian.school_2023.May.exercise05_17.demo;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet<Character> set = new TreeSet<>();

        //添加元素a,b,c
        for(char i = 'a';i <'d';i++){
            set.add(i);
        }

        Iterator<Character> it = set.iterator();

        System.out.println("集合Set元素:");
        while (it.hasNext()){
            System.out.print(it.next() +" ");
        }

        SortedSet<Character> subSet = set.subSet('a','c');//包头不包尾,a,b元素

        System.out.println();
        System.out.println("集合subSet元素:");
        Iterator<Character> it2 = subSet.iterator();
        while (it2.hasNext()){
            System.out.print(it2.next() + " ");
        }
    }
}
