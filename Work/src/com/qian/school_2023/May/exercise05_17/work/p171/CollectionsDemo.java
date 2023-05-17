package com.qian.school_2023.May.exercise05_17.work.p171;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 30, 20, 50, 10, 40);
        System.out.println("排序前:" + list);

        //默认情况下按照自然顺序排序
        Collections.sort(list);
        System.out.println("排序后:" + list);

        //利用二分查找法查找
        System.out.println("数据30的索引号:" + Collections.binarySearch(list, 30));

        System.out.println("集合中的最大值:" + Collections.max(list));

        //对集合反转
        Collections.reverse(list);

        System.out.println("反转后:" + list);

        //随机置换
        Collections.shuffle(list);

        System.out.println("随机置换后:" + list);
    }
}
