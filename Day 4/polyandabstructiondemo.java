public class polyandabstructiondemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
    }
}

// abstract class

abstract class Animal {
    void sleep() {
        System.out.println("Animal is sleeping");
    }

    abstract void eat();
}

class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("Dog is eating");
    }
}

// interface

interface Vehicle {
    void start();
    void stop();
}

interface ElectricVehicle {
    void charge();
}

class bike implements Vehicle, ElectricVehicle {
    public void start() {
        System.out.println("Bike is starting");
    }

    public void stop() {
        System.out.println("Bike is stopping");
    }

    public void charge() {
        System.out.println("Bike is charging");
    }
}