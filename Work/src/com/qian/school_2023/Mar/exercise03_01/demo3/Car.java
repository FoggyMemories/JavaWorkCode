package com.qian.school_2023.Mar.exercise03_01.demo3;

public class Car {
    private String brand;
    private int color;
    private int type;

    public Car() {
    }

    public Car(String brand, int color, int type) {
        this.brand = brand;
        this.color = color;
        this.type = type;
    }

    /**
     * 获取
     *
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置
     *
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 获取
     *
     * @return color
     */
    public int getColor() {
        return color;
    }

    /**
     * 设置
     *
     * @param color
     */
    public void setColor(int color) {
        this.color = color;
    }

    /**
     * 获取
     *
     * @return type
     */
    public int getType() {
        return type;
    }

    /**
     * 设置
     *
     * @param type
     */
    public void setType(int type) {
        this.type = type;
    }

    public String printColor(int color) {
        switch (color) {
            case 1 -> {
                return "红色";
            }
            case 2 -> {
                return "黄色";
            }
            case 3 -> {
                return "蓝色";
            }
            default -> {
                return "未定义的颜色";
            }
        }
    }

    public String printType(int type) {
        switch (this.type) {
            case 1 -> {
                return "轿车";
            }
            case 2 -> {
                return "卡车";
            }
            case 3 -> {
                return "越野车";
            }
            case 4 -> {
                return "公交车";
            }
            default -> {
                return "未定义型号";
            }
        }
    }
}
