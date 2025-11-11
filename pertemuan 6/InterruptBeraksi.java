public class InterruptBeraksi {
    public static void main(String[] args) {
        Task t1 = new Task();
        t1.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
        t1.interrupt();
        System.out.println("Sinyal Interrupt dikirimkan");
    }
}