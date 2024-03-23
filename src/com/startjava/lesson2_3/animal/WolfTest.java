package com.startjava.lesson2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setGender("Мужской");
        wolf.setMoniker("Барс");
        wolf.setWeight(60);
        wolf.setAge(2);
        wolf.setColor("Белый");

        System.out.println(wolf.getGender());
        System.out.println(wolf.getMoniker());
        System.out.println(wolf.getWeight());
        System.out.println(wolf.getAge());
        System.out.println(wolf.getColor());

        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}