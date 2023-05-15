package com.qian.school_2022.Novm.exercise11_23.test;

import java.util.Scanner;

public class SwitchTest {

    public static void main(String[] args) {
        valueTheGrade();
    }

    public static void valueTheGrade() {
        double score;
        Scanner sc1 = new Scanner(System.in);
        for (int i = 1; i < 4; i++) {
            System.out.println("请输入第" + i + "个学生成绩");
            score = sc1.nextDouble();
            int grade = (int) (score / 10);//得到十位或者百位和十位的数
            switch (grade) {
                case 10:
                    System.out.println("优秀");
                    break;
                case 9:
                    System.out.println("优秀");
                    break;
                case 8:
                    System.out.println("良好");
                    break;
                case 7:
                    System.out.println("中等");
                    break;
                case 6:
                    System.out.println("及格");
                    break;
                default:
                    System.out.println("不及格");
            }
        }
        sc1.close();
    }

}