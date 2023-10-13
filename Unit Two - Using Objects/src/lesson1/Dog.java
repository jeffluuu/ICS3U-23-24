package lesson1;

public class Dog {
    // Attributes
    private String name;
    private int age;
    private String breed;
    private boolean isHungry;

    // Constructor to initialize dog attributes
    public Dog(String dogName, int dogAge, String dogBreed) {
        name = dogName;
        age = dogAge;
        breed = dogBreed;
        isHungry = true; // By default, a new dog is hungry
    }

    // Method to make the dog bark
    public void bark() {
        System.out.println(name + " says Woof! Woof!");
    }

    // Method to feed the dog
    public void feed() {
        if (isHungry) {
            System.out.println(name + " is eating.");
            isHungry = false;
        } else {
            System.out.println(name + " is not hungry right now.");
        }
    }

    // Method to check if the dog is a puppy
    public boolean isPuppy() {
        return age < 1;
    }

    // Method to get the dog's age
    public int getAge() {
        return age;
    }

    // Method to get the dog's breed
    public String getBreed() {
        return breed;
    }
}

