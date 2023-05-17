package com.qian.school_2023.May.exercise05_17.demo;

public class ShirtDemo {
    public static void main(String[] args) {
        Shirt s1 = new Shirt();
        s1.setName("花衬衫");
        s1.setSize(Size.M);

        System.out.println(s1);
    }
}

enum Size{
    S,M,XL,XXL,XXXL;
}

class Shirt{
    private String name;
    private Size size;


    public Shirt() {
    }

    public Shirt(String name, Size size) {
        this.name = name;
        this.size = size;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return size
     */
    public Size getSize() {
        return size;
    }

    /**
     * 设置
     * @param size
     */
    public void setSize(Size size) {
        this.size = size;
    }

    public String toString() {
        return "名称:" + name + ",尺码" + size;
    }
}
