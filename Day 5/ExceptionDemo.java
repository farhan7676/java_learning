import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a:");
            int a = sc.nextInt();

            System.out.println("Enter b:");
            int b = sc.nextInt();

            System.out.println("a: " + a);
            System.out.println("b: " + b);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter whole numbers.");
        }
    }
}