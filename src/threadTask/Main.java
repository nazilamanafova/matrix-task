package threadTask;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        MyThread thread = new MyThread();
        MyThread thread2 = new MyThread();

        thread.start();
        thread2.start();

        thread.join();
        thread2.join();

        System.out.println(Counter.getCount());

    }
}
