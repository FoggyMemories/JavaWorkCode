package com.qian.school_2023.Mar.exercise03_15.work.p101;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentsTest {
    public static void main(String[] args) {
        ArrayList<Students> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            Students s = new Students();
            System.out.println("请输入第" + i + "位学生的姓名、学号、年级");
            s.setName(sc.next());
            //next()不会吸取字符前/后的空格/Tab键，只吸取字符，开始吸取字符（字符前后不算）直到遇到空格/Tab键/回车截止吸取；
            //nextLine()吸取字符前后的空格/Tab键，回车键截止。
            s.setID(sc.nextInt());
            s.setState(sc.nextInt());
            list.add(s);
        }
        int count = 0;
        System.out.println("所有二年级的学生姓名\t\t\t学号为：");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getState() == 2) {
                System.out.println(list.get(i).getName() + "\t\t\t\t" + list.get(i).getID());
                count++;
            }
        }
        System.out.println("二年级学生共有:" + count + "人");
    }
}
