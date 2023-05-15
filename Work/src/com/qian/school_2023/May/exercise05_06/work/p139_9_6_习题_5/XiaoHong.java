package com.qian.school_2023.May.exercise05_06.work.p139_9_6_习题_5;

public class XiaoHong extends Employee {
    @Override
    public void playCSGO() {
        System.out.println("雇员" + getName() + "在玩CSGO");
    }

    @Override
    public void playGames() {
    }

    @Override
    public void playLOL() {
        System.out.println("雇员" + getName() + "在玩LOL");
    }

    public XiaoHong() {
    }

    public XiaoHong(String name, int age) {
        super(name, age);
    }
}
