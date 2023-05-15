package com.qianrui.A01_test;

import java.lang.Math;
import java.util.Random;

public class MathTest {
	public static void main(String[] args){
		System.out.println("sin(30) = " + Math.sin(Math.PI/6));
		System.out.println("小于-10.8的最大整数是:" + Math.floor(-10.8));
		System.out.println("2的3次方：" + Math.pow(2 , 3));
		Random r1 = new Random();

		System.out.println("随机bool类型数：" + r1.nextBoolean());
		System.out.println("随机double类型数(0 ~ 1):" + r1.nextDouble());
		System.out.println("随机int类型数（int范围内)" + r1.nextInt());
	}
}
