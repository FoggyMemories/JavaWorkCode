package com.qian.school_2023.May.exercise05_24.demo;

public class ExceptionClass {
    public static void main(String[] args) {
        int a = 100;
        int b = 0;
        //try...catch代码块，是把可能抛出一场的代码放在try代码块里面，把抛出的异常在catch代码块里面进行处理
        try{
            int result = a / b;
        } catch (Exception e){//捕获异常的多态
            System.out.println("1." + e.getMessage());
            System.out.println("2." + e.toString());
            System.out.print("3." + e.getLocalizedMessage() + "\n4.");
            e.printStackTrace();
        }

        //System.out.println(result);
    }
}
