public class TypeCasting {
    public static void main(String[] args) {
        int a = 10;
        double b = a; // Implicit casting (int to double)
        System.out.println("Value of b: " + b);

        double c = 9.78;
        int d = (int) c; // Explicit casting (double to int)
        System.out.println("Value of d: " + d);
    }
    
}
