package com.qian.school_2023.May.exercise05_17.work.p172;

public class Shirt {
    private String name;
    private double bid;
    private Size size;

    public Shirt() {
    }

    public Shirt(String name, double bid, Size size) {
        this.name = name;
        this.bid = bid;
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
     * @return bid
     */
    public double getBid() {
        return bid;
    }

    /**
     * 设置
     * @param bid
     */
    public void setBid(double bid) {
        this.bid = bid;
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
        StringBuilder sb = new StringBuilder();
        sb.append("名称: " + this.getName() + "; ");
        sb.append("价格: " + this.getBid() + "; ");
        sb.append("尺码: " + this.getSize() + "; ");

        return sb.toString();
    }
}

