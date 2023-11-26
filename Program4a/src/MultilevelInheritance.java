package Program4a.src;

// Multilevel inheritance
class Animall {
    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Dogg extends Animall {
    public void bark() {
        System.out.println("Dog is barking");
    }
}

class BabyDog extends Dogg {
    public void play() {
        System.out.println("BabyDog is playing");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        BabyDog babyDog = new BabyDog();
        babyDog.eat();
        babyDog.bark();
        babyDog.play();
    }
}
