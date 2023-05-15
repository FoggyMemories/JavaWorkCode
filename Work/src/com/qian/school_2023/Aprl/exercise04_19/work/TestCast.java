package com.qian.school_2023.Aprl.exercise04_19.work;

public class TestCast {
    public static void main(String[] args) {
        Object p1 = new Student();
        Object p2 = new Graduate();
        displayObject(p1);
        displayObject(p2);
    }

    static void displayObject(Object object) {
        if (object instanceof Graduate) {
            Graduate g = (Graduate) object;
            System.out.println(g.toString());
        } else if (object instanceof Student) {
            Student s = (Student) object;
            System.out.println(s.toString());
        }
    }
}

