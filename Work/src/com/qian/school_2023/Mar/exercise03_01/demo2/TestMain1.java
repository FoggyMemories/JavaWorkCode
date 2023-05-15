package com.qian.school_2023.Mar.exercise03_01.demo2;
//1.构造方法
//1.1方法名和类名相同.
//1.2方法没有返回值.
//1.3每个类至少一个构造方法.
//1.4构造方法在new对象时被自动调用
//1.5构造方法的重载
//1.6默认的构造方法,在类如果有了有参构造方法以后,没有被写出来,则他就不存在了
//再有参数的构造方法村内在时还需要无参的构造方法,则需要把它写出来
public class TestMain1 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog(2);
    }
}
