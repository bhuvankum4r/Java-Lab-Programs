package Program4a.src;

// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

public class SingleInheritence {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // This method is inherited from Animal class
        dog.bark();
    }
}
