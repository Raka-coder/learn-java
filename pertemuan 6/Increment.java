public class Increment implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            MainIncrement.increment();
        }
    }
}
