public class encapsulationDemo {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Farhan");
        student.setAge(20);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}

class Student {

    // Private data members: cannot be accessed directly outside this class

    private String name;
    private int age;

    // Getter method

    public String getName() {
        return name;
    }

    // Setter method

    public void setName(String name) {
        this.name = name;
    }

    // Getter method

    public int getAge() {
        return age;
    }

    // Setter method with validation
    
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be greater than 0.");
        }
    }
}
