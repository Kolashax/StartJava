package com.startjava.lesson2_3.robot;

public class Jaeger {
    
    private String name;
    private int launch;
    private String mark;
    private String status;
    private String origin;
    private double height;
    private double speed;
    private double strength;
    private int weight;
    private int armor;

    public Jaeger() {}

    public Jaeger(String name, int launch, String mark, String status, String origin, 
            double height, double speed, double strength, int weight, int armor) {
        this.name = name;
        this.launch = launch;
        this.mark = mark;
        this.status = status;
        this.origin = origin;
        this.height = height;
        this.speed = speed;
        this.strength = strength;
        this.weight = weight;
        this.armor = armor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLaunch(int launch) {
        this.launch = launch;
    }

    public int getLaunch() {
        return launch;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public double getStrength() {
        return strength;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public void jump() {
        System.out.println("Робот по именем " + getName() + "Прыгает");
    }

    public void fire() {
        System.out.println("Робот под именем " +  getName() + " Выстрелил " + 1 + " Раз");
    }
    
    public void sayName() {
        System.out.println("Мое имя " + getName());
    }
}