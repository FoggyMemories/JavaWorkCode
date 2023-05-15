package com.qianrui.A01_test;

public class InnerClassTest3{
	public static void main(String[] args){
		Outer4 outer4 = new Outer4();
		outer4.introduce();
	}
}

//方法内部定义在方法中，调用也在方法中
class Outer4{
	public void introduce(){
		class Inner4{
			int age = 1;
			public void show(){
				System.out.println("哈哈，我是方法内部类的show方法！");
			}
		}
		Inner4 in4 = new Inner4();
		in4.show();
		System.out.println("内部类age = " + in4.age);
	}
}
