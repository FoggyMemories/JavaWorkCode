package com.qian.school_2023.Mar.exercise03_01.demo1;

public class MySchool {
    private String name;
    private String location;

    public MySchool() {
    }

    public MySchool(String name, String location) {
        this.name = name;
        this.location = location;
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
     * @return location
     */
    public String getLocation() {
        return location;
    }

    /**
     * 设置
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    public String toString() {
        return "MySchool{name = " + name + ", location = " + location + "}";
    }
}
