package com.qian.school_2023.May.exercise05_17.demo;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        for (int i = 0; i < 5; i++) {
            //进栈
            s1.push(i);
        }

        //出栈
        while (!s1.isEmpty()) {
            System.out.print("弹出元素" + s1.pop());
            System.out.println(",栈中还剩" + s1.size() + "个元素!");
        }

    }
}
