package com.qian.school_2023.Jun.exercise06_07;

import java.io.File;
import java.io.IOException;

public class Test1 {
    static File file = null;

    public Test1() {
        file = new File("C:\\Users\\Latitude7490\\Desktop\\Test", "test.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void showProperties() {
        System.out.println("文件存在:" + file.exists());
        System.out.println("文件隐藏:" + file.isHidden());
        System.out.println("文件是否可读:" + file.canRead());
        System.out.println("文件的长度:" + file.length() + "字节!");
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.showProperties();
    }
}
