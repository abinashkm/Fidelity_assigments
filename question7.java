
class Animal1 {
    public void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Barking...");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("Meowing...");
    }
}

public class question7  {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat();
        dog.bark();

        cat.eat();
        cat.meow();
    }
}
