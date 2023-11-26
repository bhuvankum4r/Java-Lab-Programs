package Program4a.src;

interface CanFly {
    void fly();
}

interface CanSwim {
    void swim();
}

class Bird implements CanFly, CanSwim {
    public void fly() {
        System.out.println("Bird is flying");
    }

    public void swim() {
        System.out.println("Bird is swimming");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
        bird.swim();
    }
}
