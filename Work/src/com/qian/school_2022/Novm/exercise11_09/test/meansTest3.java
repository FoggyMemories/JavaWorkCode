package com.qian.school_2022.Novm.exercise11_09.test;

public class meansTest3 {
    public static void main(String[] args) {
        level("蔡徐坤",50);
        for (int i = 5; i < 10; i++) {
            level("蔡徐坤",i * 10);
        }
    }
    public static void level(String name,double score) {
        switch ((int) (score / 10)) {
            case 10:
            case 9:
                System.out.println(name + "优秀");
                break;
            case 8:
                System.out.println(name + "良好");
                break;
            case 7:
                System.out.println(name + "中等");
                break;
            case 6:
                System.out.println(name + "及格");
                break;
            default:
                System.out.println(name + "不及格");
                break;
        }
    }
}
