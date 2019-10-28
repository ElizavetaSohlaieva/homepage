package com.epam.oop2;

public class ID {
    private static int nextId = (int) (Math.random() * 100 + 1);
    private int id;

    public ID(){
        id= nextId; nextId++;
    }
    public int getId(){
        return id;
    }

}
