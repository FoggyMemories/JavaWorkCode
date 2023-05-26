package com.qian.school_2023.May.exercise05_24.work.p259_15_8_5;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
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
        if (name.length() < 2 || name.length() > 5) {
            throw new NameFormatException("学生的名字长度有误,长度应当在2 ~ 5");
        }
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
        if (age < 18 || age > 25) {
            throw new AgeOutBoundsException("学生的年龄有误,年龄应当在18 ~ 25");
        }
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
