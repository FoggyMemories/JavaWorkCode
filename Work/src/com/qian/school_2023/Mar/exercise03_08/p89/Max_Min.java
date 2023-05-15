package com.qian.school_2023.Mar.exercise03_08.p89;

public class Max_Min {
    float max = 0;
    float min = 0;

    void max_A(float x, float y, float z) {
        System.out.println(getMax(x, y, z) * 100);
        System.out.println(getMin(x, y, z) / 100);
    }

    static void max_B(float x, float y, float z) {
        System.out.println(getMax(x, y, z) * 100);
        System.out.println(getMin(x, y, z) / 100);
    }

    static float getMax(float x, float y, float z) {
        float a = Math.max(x, y);
        float b = Math.max(a, z);
        return b;
    }

    static float getMin(float x, float y, float z) {
        float a = Math.min(x, y);
        float b = Math.min(a, z);
        return b;
    }
}
