package com.qian.school_2023.May.exercise05_24.work.p259;

import java.util.Scanner;

public class CheckScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        try {
            check(score);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    private static void check(int score) throws MyException {
        if (score > 100 || score < 0) {
            throw new MyException("分数不合法,必须再0--100之间");
        } else {
            System.out.println("分数合法,你的分数是" + score);
        }
    }
}
