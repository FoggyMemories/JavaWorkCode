package com.qian.school_2023.Feb.exercise02_22;

import java.util.Scanner;

public class Work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Home h = new Home();
        System.out.println("请输入你所在城市的省份:");
        h.setLocation(sc.next());
        System.out.println("请输入你所在的城市:");
        h.setName(sc.next());
        System.out.println("请输入你所在城市的历史:");
        h.setHistory(sc.nextInt());
        System.out.println("请输入你所在城市的特点:");
        h.setFeature(sc.next());
        System.out.println("请输入你所在城市的美食:");
        h.setDelicacies(sc.next());

        h.show(h.getName(), h.getLocation(), h.getHistory());
        h.showLocation(h.getLocation(), h.getFeature());
        h.showMeat(h.getName(), h.getDelicacies());
    }
}