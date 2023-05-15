package com.qian.school_2023.Mar.exercise03_15.work.p101;

import java.util.Scanner;

public class Students {
    Scanner sc = new Scanner(System.in);
    private String name;
    private int ID;
    private int state;

    public Students() {
    }

    public Students(String name, int ID, int state) {
        this.name = name;
        this.ID = ID;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        if (state >= 1 && state <= 4) {
            this.state = state;
        } else {
            System.out.println("输入的年级有误,请重新输入.");
            setState(sc.nextInt());
        }

    }
}
