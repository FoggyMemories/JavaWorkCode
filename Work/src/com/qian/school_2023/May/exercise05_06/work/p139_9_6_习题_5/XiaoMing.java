package com.qian.school_2023.May.exercise05_06.work.p139_9_6_习题_5;

public class XiaoMing extends Student {
    @Override
    public void playCSGO() {
        System.out.println("学生" + getName() + "在玩CSGO");
    }

    @Override
    public void playGames() {
    }

    @Override
    public void playLOL() {
        System.out.println("学生" + getName() + "在玩LOL");
    }

    public XiaoMing() {
    }

    public XiaoMing(String name, int age) {
        super(name, age);
    }
}
