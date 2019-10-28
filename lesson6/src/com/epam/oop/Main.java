package com.epam.oop;

import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	//Animal animal = new Animal();
	//animal.viewAnimal();
	//animal.setName("cat");
	//animal.setSpeed(20);
	//animal.setAge(5);
	//animal.viewAnimal();

	Animal dog = new Animal("Dog");
	dog.viewAnimal();
	Animal[] arrayAnimal = {new Animal(), new Animal("Mouse"),
                            new Animal("cat", 15, 12),
                            new Animal("dog", 50, 6),
                            new Animal("dog", 40, 4)};
	printAnimals(arrayAnimal);
	System.out.println("-----------------");
	printAnimals(searchAnimal(arrayAnimal, 5));
	System.out.println("-----------------");
	printAnimals(search(arrayAnimal, "cat"));
    }
    static void printAnimals(Animal[] array){
        if (array.length == 0) {
            System.out.println("Not animal");
        }else {
            for (Animal elem: array) {
                elem.viewAnimal();
            }
        }
    }

    static Animal[] searchAnimal(Animal[] animals, int age){
        Animal[] res = new Animal[animals.length];
        int counter = 0;
        for (Animal an: animals) {
            if (an.getAge() > age){
                res[counter++] = an;
            }
        }
        return Arrays.copyOf(res, counter);
    }
    static Animal[] search(Animal[] animals, String name){
        Animal[] res = new Animal[animals.length];
        int counter = 0;
        for (Animal an: animals) {
            if (an.getName() .equals(name)){
                res[counter++] = an;
            }
        }
        return Arrays.copyOf(res, counter);
    }
}
