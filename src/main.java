package src;

import java.util.*;

public class Main {
    public static void main (String[] args)
    {
        String name;
        int age;
        double GPA;
        boolean isEnrolled;

        int[] marks = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ");
        name = sc.nextLine();
        System.out.println("Enter your age ");
        age = sc.nextInt();
        System.out.println("Enter your GPA ");
        GPA = sc.nextDouble();
        System.out.println("Are you enrolled? (true/false) ");
        isEnrolled = sc.nextBoolean();
        System.out.println("Enter your marks ");

        for(int i=0; i<marks.length; i++)
        {
            marks[i] = sc.nextInt();

        }
        int total = calculateTotal(marks);
        double average = calculateAverage(total, marks.length);

        char grade;

        if (average >= 90) {
            grade = 'A';
        }
        else if (average >= 80) {
            grade = 'B';
        } 
        else if (average >= 70) {
            grade = 'C';
        } 
        else if (average >= 60) {
            grade = 'D';
        } 
        else {
            grade = 'F';
        }

        System.out.println("User name is: " + name);
        System.out.println("User age is: " + age);
        System.out.println("User GPA is: " + GPA);
        System.out.println("Is enrolled: " + isEnrolled);

        for(int i=0; i<marks.length; i++)
        {
            System.out.println("Mark " + (i+1) + ": " + marks[i]);
        }

        System.out.println("Total marks: " + total);
        System.out.println("Average marks: " + average);
        System.out.println("Grade: " + grade);
        sc.close();
    }

    static int calculateTotal(int[] marks) {
        int total = 0;
        for (int mark: marks) {
            total += mark;
        }
        return total;
    }
    static double calculateAverage(int total , int count) {
        return (double) total / count;
    }    
}