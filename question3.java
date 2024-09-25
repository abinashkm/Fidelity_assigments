
class Person {
    private String name;
    public String gender;
    public int age;

    // Constructor
    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    // Getter for private variable
    public String getName() {
        return name;
    }

    // Display method
    public void display() {
        System.out.println("Name: " + getName() + ", Gender: " + gender + ", Age: " + age);
    }
}

public class question3 {
    public static void main(String[] args) {
        Person p = new Person("Alice", "Female", 25);
        p.display();
    }
}

