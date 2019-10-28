package com.epam.oop;


public class Animal {
    private String name;
    private int speed;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void viewAnimal(){
        System.out.println("Names= " + this.getName() + ", Speed= " + this.getSpeed() + ", Age= " + this.getAge());

    }

    public Animal() {
        this("animal", 4, 5);
    }

    public Animal(String name) {
       // this.name = name;
      // this.speed = 40;
        // this.age = 10;
        this(name, 40, 10);
    }

    public Animal(String name, int speed, int age) {
        this.name = name;
        this.speed = speed;
        this.age = age;
    }
}
