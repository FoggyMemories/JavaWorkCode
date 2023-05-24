package com.qian.school_2023.May.exercise05_24.demo;

public class ExceptionFinally {
    public static void main(String[] args) {
        try{//方法里面抛出异常，用throw语句抛出异常对象
            Exception e1 = new Exception("异常测试！");
            //throw e1;
            throw new RuntimeException();
        }catch (Exception e){
            System.out.println("1." + e.getMessage());
            System.out.println("2." + e);
            System.out.print("3." + e.getLocalizedMessage() + "\n4.");
            e.printStackTrace();
        }finally {//finally代码块是把无论是否有异常都必须来执行
            //finally执行语句
            System.out.println("无论是否有异常是否都必须来打卡");
        }
    }
}
