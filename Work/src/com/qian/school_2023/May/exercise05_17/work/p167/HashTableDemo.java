package com.qian.school_2023.May.exercise05_17.work.p167;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args) {
        long totalTime = 0;
        long callTime = 0;

        Map map = new Hashtable();

        System.out.println("写入/读取10万个数据所用时间比较:(单位:毫秒)");

        callTime = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            map.put("" + i, i);
        }

        totalTime = System.currentTimeMillis() - callTime;

        System.out.println("Hashtable写入时所有时间：" + totalTime);
        callTime = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            map.get("" + i);
        }

        totalTime = System.currentTimeMillis() - callTime;
        System.out.println("Hashtable读取时所用时间：" + totalTime);
    }
}
