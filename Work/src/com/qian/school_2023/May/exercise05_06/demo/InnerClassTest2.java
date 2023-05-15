package com.qian.school_2023.May.exercise05_06.demo;

public class InnerClassTest2{
	public static void main(String[] args){
	//不能对私有内部类new对象，可以通过外部类方法调用该私有的内部类资源
	Outer3 out3 = new Outer3();	
	out3.diaoYong();
	}
}


class Outer3{
	int age = 100;
	private class Inner3{
		int age = 1;
		public void introduce(){
			System.out.println("哈哈，我是私有内部类的introduce方法");
		}
	}
	public void diaoYong(){
		Inner3 in3 = new Inner3();
		in3.introduce();
		System.out.println("私有内部类age = " + in3.age);
		}
}

