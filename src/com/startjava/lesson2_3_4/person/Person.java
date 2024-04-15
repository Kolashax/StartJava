package com.startjava.lesson2_3.person;

public class Person {

    String gender = "Мужской";
    String name = "Петя";
    double height = 1.80;
    int age = 20;

    public void walk() {
        System.out.println("Человек с именем " + name + "Ходит");
    }

    public void seat() {
        System.out.println("Человек с именем " + name + "Сидит");
    }

    public void run() {
        System.out.println("Человек с именем " + name + "Бежит");
    }

    public void say() {
        System.out.println("Человек с именем " + name + "Говорит");
    }

    public void learnJava() {
        System.out.println("Человек с именем " + name + "Учит Java");
    }
}