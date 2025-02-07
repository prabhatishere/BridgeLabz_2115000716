// Animal Hierarchy
// Description: Create a hierarchy where Animal is the superclass, and Dog, Cat, and Bird are subclasses. Each subclass has a unique behavior.
// Tasks:
// Define a superclass Animal with attributes name and age, and a method makeSound().
// Define subclasses Dog, Cat, and Bird, each with a unique implementation of makeSound().
// Goal: Learn basic inheritance, method overriding, and polymorphism with simple classes.

class Animal{
    protected String name;
    protected int age;
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void makeSound(){
        System.out.println("Some generic animal sound");
    }
}
class Dog extends Animal{
    public Dog(String name, int age){
        super(name, age);
    }
    @Override
    public void makeSound() {
        System.out.println(name + " barks: Woof! Woof!");
    }
}

class Cat extends Animal{
    public Cat(String name, int age){
        super(name, age);
    }
    @Override
    public void makeSound() {
        System.out.println(name + " meows: Meow! Meow!");
    }
}

class Bird extends Animal{
    public Bird(String name, int age){
        super(name, age);
    }
    @Override
    public void makeSound() {
        System.out.println(name + " chirps: Tweet! Tweet!");
    }
}

public class AnimalHierarchy{
    public static void main(String[] args) {
        Animal animal = new Animal("Dogno", 3);
        Animal dog = new Dog("Rasset", 2);
        Animal cat = new Cat("Sumo", 1);
        Animal bird = new Bird("UFO", 5);
        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();

    }
}