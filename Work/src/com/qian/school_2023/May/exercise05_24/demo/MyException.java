package com.qian.school_2023.May.exercise05_24.demo;

public class MyException {
    public static void main(String[] args) {

    }
    public static void check(double d) throws WoException{
        if(d >100 || d < 0) throw new WoException();
        else{
            System.out.println("您的分数是: " + d);
        }
    }
}

//自定义异常一定是把系统的某个异常进行继承
class WoException extends Exception{

}
