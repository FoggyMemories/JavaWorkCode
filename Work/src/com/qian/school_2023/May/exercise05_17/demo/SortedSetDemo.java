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
            System.out.print(it.next() +", ");
        }
    }
}
