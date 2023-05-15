package com.qian.school_2023.Aprl.exercise04_19.demo;

public class Test5 {
    public static void main(String[] args) {
        Father[] f = new Father[5];

        f[0] = new Father();
        f[1] = new Son();
        f[2] = new Daughter();
        Daughter d1 = (Daughter) f[2];
        Son s2;
        if(f[1]instanceof Son){
            s2 = (Son) f[1];
        }
        name(f[0]);
        name(f[1]);
        name(f[2]);
    }
    public static void name(Father f){

    }
}
class Father{}
class Son extends Father{}
class Daughter extends Father{}