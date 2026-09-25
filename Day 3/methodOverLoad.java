public class methodOverLoad {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        methodOverLoad obj = new methodOverLoad();
        System.out.println("Sum of two integers: " + obj.add(5, 10));
        System.out.println("Sum of two doubles: " + obj.add(5.5, 10.5));
    }
}
