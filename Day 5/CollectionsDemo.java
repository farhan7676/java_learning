import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        Collections.addAll(fruits, "Mango", "Apple", "Banana", "Apple");

        System.out.println("Original: " + fruits);

        Collections.sort(fruits);
        System.out.println("Sorted: " + fruits);

        System.out.println("First alphabetically: " + Collections.min(fruits));
        System.out.println("Last alphabetically: " + Collections.max(fruits));
        System.out.println("Number of Apples: " + Collections.frequency(fruits, "Apple"));

        Collections.reverse(fruits);
        System.out.println("Reversed: " + fruits);

        Collections.shuffle(fruits);
        System.out.println("Shuffled: " + fruits);
    }
}