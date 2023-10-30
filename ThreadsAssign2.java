package program;
class NumberPrinter {
    private int n;
    private boolean isOdd;
    public NumberPrinter(int n, boolean isOdd) {
        this.n = n;
        this.isOdd = isOdd;
    }
    public synchronized void printNumber() {
        for (int i = 1; i <= n; i++) {
            while (isOdd && i % 2 == 0) {
                try {
                    wait(); // Wait for even numbers to print
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            while (!isOdd && i % 2 != 0) {
                try {
                    wait(); // Wait for odd numbers to print
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println(Thread.currentThread().getName() + ": " + i);
            if (isOdd) {
                isOdd = false;
            } else {
                isOdd = true;
            }
            notify(); // Notify the other thread to print
        }
    }
}
public class ThreadsAssign2 {
    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter(100, true);
        Thread oddThread = new Thread(() -> {
            printer.printNumber();
        }, "OddThread");
        Thread evenThread = new Thread(() -> {
            printer.printNumber();
        }, "EvenThread");
        oddThread.start();
        evenThread.start();
    }
}

