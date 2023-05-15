package com.qian.school_2023.Mar.exercise03_01.demo1;

import com.qian.school_2023.Mar.exercise03_01.demo1.MySchool;

public class Test {
    public static void main(String[] args) {
        MySchool s = new MySchool();
        s.setName("lida");
        s.setLocation("shanghai");

        System.out.println("学校的名字是:" + s.getName() + ",学校的地址是:" + s.getLocation());
    }
}
