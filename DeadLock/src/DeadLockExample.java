import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockExample {
    private static Lock lock1 = new ReentrantLock();
    private static Lock lock2 = new ReentrantLock();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            lock1.lock();
            System.out.println("Thread 1: Holding lock 1...");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}

            System.out.println("Thread 1: Waiting for lock 2...");
            lock2.lock();
            System.out.println("Thread 1: Holding lock 1 & 2...");

            lock2.unlock();
            lock1.unlock();
        });

        Thread thread2 = new Thread(() -> {
            lock2.lock();  // Захватываем lock2
            System.out.println("Thread 2: Holding lock 2...");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}

            System.out.println("Thread 2: Waiting for lock 1...");
            lock1.lock();
            System.out.println("Thread 2: Holding lock 2 & 1...");

            lock1.unlock();
            lock2.unlock();
        });

        thread1.start();
        thread2.start();
    }
}