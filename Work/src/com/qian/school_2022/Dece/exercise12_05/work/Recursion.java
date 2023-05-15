package com.qian.school_2022.Dece.exercise12_05.work;

public class Recursion {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        int c = 27;
        System.out.println("gcd(" + a + "," + b + ") =" + gcd(a, b));
        System.out.println("gcd(" + (-a) + "," + b + ") =" + gcd(-a, b));
        System.out.println("gcd(" + a + "," + b + "," + c + ") =" + gcd(a, b, c));
        System.out.println("multiple(" + a + "," + b + ")=" + multiple(a, b));
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        if (a < 0) return gcd(-a, b);
        if (b < 0) return gcd(a, -b);
        return gcd(b, a % b);
    }

    public static int gcd(int a, int b, int c) {
        return gcd(gcd(a, b), c);
    }

    public static int multiple(int a, int b) {
        return a * b / gcd(a, b);
    }
}
