public class Worker extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            try {
                System.out.println("Thread " + getName() + " langkah " + i);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
