public class varargsDemo {
    void add(int... a) {
        
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
    public static void main(String[] args) {
        varargsDemo demo = new varargsDemo();
        demo.add(1, 2, 3, 4, 5);
        demo.add(1,2, 3, 4, 5, 6, 7, 8, 9, 10);

}}
