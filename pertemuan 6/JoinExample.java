public class JoinExample {
    public static void main(String[] args) throws InterruptedException{
        Worker w1 = new Worker();
        Worker w2 = new Worker();
        w1.start();
        w1.join();
        w2.start();
        w2.setPriority(Thread.MAX_PRIORITY);
    }
}
