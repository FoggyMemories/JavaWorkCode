package com.qian.school_2023.Aprl.exercise04_12.demo.Test3;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(20);
        p1.setName("花花");
        Student s1 = new Student();
        s1.setAge(22);
        s1.setName("光头强");
        System.out.println(s1);

        //子类每次new对象一定是调用了某个父类的构造方法
    }
}

class Person{
    public String name;
    public int age;
    public String gender;
    public String num;

    public Person() {
        System.out.println("父类的无参构造方法");
    }

    public Person(String name, int age, String gender, String num) {
        this.name = name;
        System.out.println(name + "是爸爸");
        this.age = age;
        this.gender = gender;
        this.num = num;
    }

    public Person(String name){
        System.out.println(name + "是爸爸");
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return num
     */
    public String getNum() {
        return num;
    }

    /**
     * 设置
     * @param num
     */
    public void setNum(String num) {
        this.num = num;
    }

    public String toString() {
        return "Person{name = " + name + ", age = " + age + ", gender = " + gender + ", num = " + num + "}";
    }
}

class Student extends Person{   //子类构造方法调用父类构造方法,用super()方法,且放在子类构造方法的第一行
    @Override
    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", gender = " + gender + ", num = " + num + "}";
    }
    public Student(){
        super();//调用父类无参的构造方法
    }
    public Student(String name){
        super("张铁匠");//调用父类单参构造方法
        System.out.println("子类是" + name + "!");
    }
}
