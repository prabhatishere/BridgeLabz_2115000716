class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof");
    }
}

public class WithOverRide {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}