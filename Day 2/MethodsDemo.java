public class MethodsDemo {
    public static void main(String[] args) {
        greet();
        
        // Calling a static method

        MethodsDemo obj = new MethodsDemo();
        obj.showMessage(); 
        
        // Calling a non-static method

        int sum = obj.addNumbers(10, 20);
        System.out.println("Sum: " + sum);
    }

    // Static method

    public static void greet() {
        System.out.println("Hello! Welcome to Java methods.");
    }

    // Non-static method

    public void showMessage() {
        System.out.println("This is a non-static method.");
    }

    // Method with parameters and return value
    
    public int addNumbers(int number1, int number2) {
        return number1 + number2;
    }
}