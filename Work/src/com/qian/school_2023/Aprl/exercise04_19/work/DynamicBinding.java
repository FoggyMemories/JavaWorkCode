package com.qian.school_2023.Aprl.exercise04_19.work;

public class DynamicBinding {
    public static void main(String[] args) {
        speak(new Dog());
        speak(new Cat());
    }
    private static void speak(Animal an){
        an.roar();
    }
}
class Animal{
    public void roar() {
    }
}
class Dog extends Animal{
    @Override
    public void roar() {
        System.out.println("狗在汪汪叫");
    }
}
class Cat extends Animal{
    @Override
    public void roar() {
        System.out.println("猫在喵喵叫");
    }
}
