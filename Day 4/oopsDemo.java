public class oopsDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3);

        dog.displayInfo();
        dog.eat();
        dog.sleep();
        dog.makeSound();
    }
}

// Encapsulation

class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}

// Inheritance and Polymorphism

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating dog food");
    }

    public void makeSound() {
        System.out.println(getName() + " says: Woof Woof");
    }
}
