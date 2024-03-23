package com.startjava.lesson2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger = new Jaeger("Gipsy Danger", 2017, "Mark-3", "Destroyed", "USA", 
                79.25, 7, 8, 1980, 6);
        Jaeger jaeger1 = new Jaeger();
        jaeger1.fire();
        jaeger.sayName();
        jaeger1.jump();

        jaeger1.setName("Striker Eureka");
        jaeger1.setLaunch(2019);
        jaeger1.setMark("Mark-5");
        jaeger1.setStatus("Destroyed");
        jaeger1.setOrigin("Australia");
        jaeger1.setHeight(76.2);
        jaeger1.setSpeed(10);
        jaeger1.setStrength(10);
        jaeger1.setWeight(2087);
        jaeger1.setArmor(9);

        System.out.println(jaeger.getName());
        System.out.println(jaeger.getLaunch());
        System.out.println(jaeger.getMark());
        System.out.println(jaeger.getStatus());
        System.out.println(jaeger.getOrigin());
        System.out.println(jaeger.getHeight());
        System.out.println(jaeger.getSpeed());
        System.out.println(jaeger.getStrength());
        System.out.println(jaeger.getWeight());
        System.out.println(jaeger.getArmor() + "\n");
        
        System.out.println(jaeger1.getName());
        System.out.println(jaeger1.getLaunch());
        System.out.println(jaeger1.getMark());
        System.out.println(jaeger1.getStatus());
        System.out.println(jaeger1.getOrigin());
        System.out.println(jaeger1.getHeight());
        System.out.println(jaeger1.getSpeed());
        System.out.println(jaeger1.getStrength());
        System.out.println(jaeger1.getWeight());
        System.out.println(jaeger1.getArmor()); 
    }
}