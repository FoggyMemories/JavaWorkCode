package com.qian.school_2023.Mar.exercise03_08.p94;

public class Paper {
    private int num;
    int width;
    protected int height;

    public Paper() {
    }

    public Paper(int num, int width, int height) {
        this.num = num;
        this.width = width;
        this.height = height;
    }


    public int getNum() {
        return width + num + 10;
    }


    public void setNum(int num) {
        this.num = num;
    }


    public int getWidth() {
        return width;
    }


    public void setWidth(int width) {
        this.width = width;
    }


    public int getHeight() {
        return height;
    }


    public void setHeight(int height) {
        this.height = height;
    }

}
