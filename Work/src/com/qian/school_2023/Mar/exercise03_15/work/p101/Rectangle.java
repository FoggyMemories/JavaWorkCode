package com.qian.school_2023.Mar.exercise03_15.work.p101;

public class Rectangle {
    private float width;
    private float height;
    private String color;

    public Rectangle() {
    }

    public Rectangle(float width, float height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }


    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public float getArea(float width, float height) {
        return width * height;
    }
}
