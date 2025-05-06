public class Alternate {
    private static final Object lock = new Object();
    private static boolean isThread1Turn = true;

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    while (!isThread1Turn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }
                    System.out.println("1");
                    isThread1Turn = false;
                    lock.notifyAll();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    while (isThread1Turn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }
                    System.out.println("2");
                    isThread1Turn = true;
                    lock.notifyAll();
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
