class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child thread: " + i);
        }
    }
}

public class ThreadCreation {
    public static void main(String[] args) {
        MyThread t = new MyThread();

        t.start(); // starts a new thread

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread: " + i);
        }
    }
}