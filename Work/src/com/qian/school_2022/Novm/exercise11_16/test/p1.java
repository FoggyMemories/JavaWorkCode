package com.qian.school_2022.Novm.exercise11_16.test;

public class p1 {
    public static void main(String[] args) {
        print();
        print1("钱睿", '男',"22大数据2班");
    }
    public static void print(){
        String name = "钱睿";
        char gender = '男';
        String inform = "22大数据2班";
        System.out.println("姓名是:" + name +",性别是:"+ gender +",基本信息是:"+ inform);
    }
    public static void print1(String name,char gender,String inform){

        System.out.println("姓名是:" + name +",性别是:"+ gender +",基本信息是:"+ inform);
    }
}
