package com.qian.school_2023.May.exercise05_06.work.p139_9_6_习题_5;

public abstract class Employee implements PlayLOL, PlayCSGO {
    private String name;
    private int age;


    public Employee() {
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Employee{name = " + name + ", age = " + age + "}";
    }
}
