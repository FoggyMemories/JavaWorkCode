package com.qian.school_2022.Novm.exercise11_02.test;

public class p37_3_4 {

    public static void main(String[] args) {
        int student1 = 54, student2 = 92, student3 = 80;
        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    System.out.println("第一位学生成绩是：" + student1);
                    break;
                case 1:
                    System.out.println("第二位学生成绩是：" + student2);
                    break;
                case 2:
                    System.out.println("第三位学生成绩是：" + student3);
                    break;
                default:
                    break;
            }
        }
    }
}
