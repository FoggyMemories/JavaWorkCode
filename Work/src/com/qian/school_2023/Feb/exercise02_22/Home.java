package com.qian.school_2023.Feb.exercise02_22;

public class Home {
    private String name;
    private int history;
    private String location;
    private String feature;
    private String delicacies;

    public Home() {
    }

    public Home(String name, int history, String location, String feature, String delicacies) {
        this.name = name;
        this.history = history;
        this.location = location;
        this.feature = feature;
        this.delicacies = delicacies;
    }

    void show(String name, String location, int history) {
        System.out.println("我们的城市在" + location + "省的" + name + "市" + "距今已有" + history + "年历史了");
    }

    void showLocation(String location, String feature) {
        System.out.println("我们这个省" + location + "的特点是:" + feature);
    }

    void showMeat(String name, String delicacies) {
        System.out.println("我们这个城市" + name + "的美食是:" + delicacies);
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getHistory() {
        return history;
    }


    public void setHistory(int history) {
        this.history = history;
    }


    public String getLocation() {
        return location;
    }


    public void setLocation(String location) {
        this.location = location;
    }


    public String getFeature() {
        return feature;
    }


    public void setFeature(String feature) {
        this.feature = feature;
    }


    public String getDelicacies() {
        return delicacies;
    }


    public void setDelicacies(String delicacies) {
        this.delicacies = delicacies;
    }
}

