package myanimals;

public class Animal {
    // static variable shared by all Animal (and subclasses)
    public static int numOfAnimals = 0;
    String name;

    public Animal(String name) {
        this.name = name;
        numOfAnimals++;  // every time an Animal (or subclass) is made, increment
        System.out.println("Number of animals: " + numOfAnimals);
    }

    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }

    // static method to get total animals
    public static int getNumOfAnimals() {
        return numOfAnimals;
    }
}