package com.qian.school_2023.May.exercise05_31.demo;

//1.继承Thread类创建线程:1.创建一个类继承Thread类,重写run方法
//2.main方法里面new该新建类对象
//3.通过该对象调用start方法.
public class ThreadClass {
    public static void main(String[] args) {
        PrintChar printA = new PrintChar('a', 50);
        PrintChar printB = new PrintChar('b',50);
        PrintNum print50 = new PrintNum(50);
        print50.start();
        printA.start();
        printB.start();

    }
}

class PrintChar extends Thread {
    private char charToPrint;
    private int times;


    public PrintChar() {
    }

    public PrintChar(char charToPrint, int times) {
        this.charToPrint = charToPrint;
        this.times = times;
    }

    /**
     * 获取
     *
     * @return charToPrint
     */
    public char getCharToPrint() {
        return charToPrint;
    }

    /**
     * 设置
     *
     * @param charToPrint
     */
    public void setCharToPrint(char charToPrint) {
        this.charToPrint = charToPrint;
    }

    /**
     * 获取
     *
     * @return times
     */
    public int getTimes() {
        return times;
    }

    /**
     * 设置
     *
     * @param times
     */
    public void setTimes(int times) {
        this.times = times;
    }

    public String toString() {
        return "PrintChar{charToPrint = " + charToPrint + ", times = " + times + "}";
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.print(charToPrint);
        }
    }
}

class PrintNum extends Thread{
    private int lastNum;

    public PrintNum() {
    }

    public PrintNum(int lastNum) {
        this.lastNum = lastNum;
    }

    /**
     * 获取
     * @return lastNum
     */
    public int getLastNum() {
        return lastNum;
    }

    /**
     * 设置
     * @param lastNum
     */
    public void setLastNum(int lastNum) {
        this.lastNum = lastNum;
    }

    public String toString() {
        return "PrintNum{lastNum = " + lastNum + "}";
    }

    @Override
    public void run() {
        for (int i = 0; i < lastNum; i++) {
            System.out.println(" " + i);
        }
    }
}