public class ConstructorDemo {
    int x,y;
    ConstructorDemo(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void add () {
        System.out.println( "sum is" + (this .x + this.y));
    }
    public static void main(String[] args) {
        ConstructorDemo demo= new ConstructorDemo(10, 20);
        ConstructorDemo demo2= new ConstructorDemo(30, 40);
        System.out.println(demo.x+" "+demo.y);
        System.out.println(demo2.x+" "+demo2.y);
    }   
}
