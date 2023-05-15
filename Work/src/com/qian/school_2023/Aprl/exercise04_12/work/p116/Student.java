package com.qian.school_2023.Aprl.exercise04_12.work.p116;

class Person {
    String name;
    String num;

    public Person() {
    }

    public Person(String name, String num) {
        this.name = name;
        this.num = num;
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
     * @return num
     */
    public String getNum() {
        return num;
    }

    /**
     * 设置
     *
     * @param num
     */
    public void setNum(String num) {
        this.num = num;
    }

    public String toString() {
        return "Person{name = " + name + ", num = " + num + "}";
    }
}

public class Student extends Person {
    String school;
    String num;

    Student() {

    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "school='" + school + '\'' +
                '}';
    }
}
