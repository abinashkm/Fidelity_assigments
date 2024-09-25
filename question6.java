class Animal {
    public void eat() {
        System.out.println("Eating...");
    }
}

class Mammal extends Animal {
    public void walk() {
        System.out.println("Walking...");
    }
}

class Dog1 extends Mammal {
    public void bark() {
        System.out.println("Barking...");
    }
}

public class question6 {
    public static void main(String[] args) {
        Dog1 dog = new Dog1();
        dog.eat();
        dog.walk();
        dog.bark();
    }
}
