package com.qian.school_2022.Novm.exercise11_23.test;

import java.util.Scanner;

public class Register {
    public static void main(String[] args) {
        nameExe();
    }

    ///////////
    public static void nameExe() {
        String name;
        String password;
        String newPassword;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入用户名,密码和验证密码");
        System.out.print("用户名:");
        name = input.next();
        System.out.print("密码:");
        password = input.next();
        System.out.print("验证密码:");
        newPassword = input.next();

        while (name.length() < 3 || (!password.equals(newPassword)) || (password.length() < 6)) {
            if (name.length() < 3) {
                System.out.println("用户名不能小于3");
            }
            if ((!password.equals(newPassword)) || password.length() < 6) {
                System.out.println("两次输入密码不一样或密码不能小于6位");
            }
            System.out.println("\n" + "请重新输入");
            System.out.print("用户名:");
            name = input.next();
            System.out.print("密码:");
            password = input.next();
            System.out.print("验证密码:");
            newPassword = input.next();
        }
        System.out.println("注册成功!");
        System.out.println("用户名：" + name + "，密码为：" + password + ",验证密码为：" + newPassword);
    }
}

