package com.qian.school_2023.May.exercise05_17.demo;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map map = new TreeMap();
        for (int i = 0; i < 5; i++) {
            map.put(i,"str" + i);
        }

        System.out.println("map的容量" + map.size() + ",map元素:" + map);
    }
}
