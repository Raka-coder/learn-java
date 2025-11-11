public class MainIncrement {
    public static int count = 0;
    public static synchronized void increment() {
        int temp = count;
        String nameThread = Thread.currentThread().getName();
        System.out.println(nameThread + ": Membaca count: (nilainya menjadi = " + temp + ")");
        temp = temp + 1;
        count = temp;
        System.out.println(nameThread + ": Menulis count (nilainya menjadi = " + count + ")");
    }
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Increment());
        Thread thread2 = new Thread(new Increment());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Jumlah Count : " + count);
    }
}
