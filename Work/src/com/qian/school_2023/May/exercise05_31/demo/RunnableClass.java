package com.qian.school_2023.May.exercise05_31.demo;

//通过实现Runnable接口创建线程
//1.定义一个类,实现Runnable接口,重写run方法
//2.new Thread对象,用该类的对象作为new Thread对象的构造方法的参数
//3.该Thread对象调用start方法启动线程
public class RunnableClass {
    public static void main(String[] args) {
        Thread th1 = new Thread(new PrintC('M', 10));
        th1.start();
        new Thread(new PrintC('A', 10), "线程B").start();
        new Thread(new PrintN(10), "线程A").start();
    }
}

class PrintC implements Runnable {
    private char charToPrint;
    private int times;

    public PrintC() {
    }

    public PrintC(char charToPrint, int times) {
        this.charToPrint = charToPrint;
        this.times = times;
    }


    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.print(charToPrint + " - " + i + "    ");
        }
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
        return "PrintC{charToPrint = " + charToPrint + ", times = " + times + "}";
    }
}

class PrintN implements Runnable {
    private int lastNum;

    public PrintN() {
    }

    public PrintN(int lastNum) {
        this.lastNum = lastNum;
    }

    @Override
    public void run() {
        for (int i = 0; i < lastNum; i++) {
            System.out.println("Num-" + i + "    ");
        }
    }

    /**
     * 获取
     *
     * @return lastNum
     */
    public int getLastNum() {
        return lastNum;
    }

    /**
     * 设置
     *
     * @param lastNum
     */
    public void setLastNum(int lastNum) {
        this.lastNum = lastNum;
    }

    public String toString() {
        return "PrintN{lastNum = " + lastNum + "}";
    }
}
