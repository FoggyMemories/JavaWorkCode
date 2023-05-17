package com.qian.school_2023.May.exercise05_17.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Collections.addAll(list, 10, 5, 2, 30);

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
    }
}
