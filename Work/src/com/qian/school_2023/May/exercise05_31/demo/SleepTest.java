package com.qian.school_2023.May.exercise05_31.demo;

public class SleepTest {
    public static void main(String[] args) {
        System.out.println("当前线程:" + Thread.currentThread().getName());
        new Thread(new Sleep(),"线程A").start();
        new Thread(new Sleep(),"线程B").start();
        System.out.println("主线程死亡!");
    }
}

class Sleep implements Runnable {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + "优先级" +
                Thread.currentThread().getPriority());

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println(name + " -- " + i);
            if (i == 2) {
                Thread.currentThread().setPriority(10);
                System.out.println("新优先级:" +
                        Thread.currentThread().getPriority());
            }
        }
    }
}
