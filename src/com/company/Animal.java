package com.company;

public abstract class Animal {
    public Animal(String animalClass) {
        feetCount = 4;
        animalClass = "Mammal";
    }

    public int getFeetCount() {
        return feetCount;
    }

    public void setFeetCount(int feetCount) {
        this.feetCount = feetCount;
    }

    public String getAnimalClass() {
        return animalClass;
    }

    public void setAnimalClass(String animalClass) {
        this.animalClass = animalClass;
    }

    int feetCount;
    String animalClass;

    public abstract void talk();

    /**
     * Connects two animals by talking
     * @param animal animal with whom this object connects
     */
    public  void interact(Animal animal){
        this.talk();
        animal.talk();
    }
}
