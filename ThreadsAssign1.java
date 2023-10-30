package program;
class AverageCalculator extends Thread {
    private int[] numbers;
    private double average;

    public AverageCalculator(int[] numbers) {
        this.numbers = numbers;
    }
    public void run() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += numbers[i];
        }
        average = (double) sum / 10;
    }
    public double getAverage() {
        return average;
    }
}
class SquarePrinter extends Thread {
    private int[] numbers;

    public SquarePrinter(int[] numbers) {
        this.numbers = numbers;
    }
    public void run() {
        for (int i = 0; i < 5; i++) {
            int square = numbers[i] * numbers[i];
            System.out.println("Square of " + numbers[i] + " is " + square);
        }
    }
}
public class ThreadsAssign1 {
    public static void main(String[] args) {
        int[] arr = {1, 20, 50, 15, 30};    //array
        AverageCalculator avgThread = new AverageCalculator(arr);
        SquarePrinter squareThread = new SquarePrinter(arr);
        // Start the threads
        avgThread.start();
        squareThread.start();

        try {
            // Wait for both threads to finish
            avgThread.join();
            squareThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Get the average calculated by the first thread
        double average = avgThread.getAverage();
        System.out.println("Average of the first 10 numbers is: " + average);  //output
    }
}

