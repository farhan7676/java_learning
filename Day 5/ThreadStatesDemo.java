public class ThreadStatesDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println("Thread state before start: " + thread.getState());
        thread.start();
        System.out.println("Thread state after start: " + thread.getState());

        try {
            Thread.sleep(500);
            System.out.println("Thread state while sleeping: " + thread.getState());
            thread.join();
            System.out.println("Thread state after completion: " + thread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
