package com.qian.school_2023.May.exercise05_06.demo;

public class InnerClassTest{
	public static void main(String[] args){
		Outer2.Inner2 inner2 = new Outer2.Inner2();	
		inner2.introduce();
		System.out.println("内部类age = " + inner2.age);
	}
}

//成员内部类用static修饰。
class Outer2{
	int age = 100;
	static class Inner2{//静态类中，调用外部类成员，需要通过外部类对象调用。
		int age = 1;
		public void introduce(){
			System.out.println("哈哈，我是静态内部类的introduce方法");
		}
	}
}

