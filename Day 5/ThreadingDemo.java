public class ThreadingDemo {
    public static void main(String[] args) {
        Thread firstThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("First thread: " + i);
            }
        });

        Thread secondThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Second thread: " + i);
            }
        });

        firstThread.start();
        secondThread.start();
    }
}