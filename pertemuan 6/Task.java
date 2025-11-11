public class Task extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Langkah ke-" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread dihentikan saat tidur");
        }
        System.out.println("Thread Selesai!");
    }
}