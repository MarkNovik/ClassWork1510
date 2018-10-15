package com.company;

public class Dog extends Animal{
    public Dog(String animalClass) {
        super(animalClass);
    }
    @Override
    public void talk(){
        System.out.println("Woof-woof");
    }
}
