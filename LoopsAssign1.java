package program;
import java.util.Scanner;
public class LoopsAssign1 {
    public static void main(String[] args) {

        int[] integers = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {			//taking 5 inputs
            System.out.print("Enter "+i+" integer: ");
            integers[i] = sc.nextInt();
        }
        int total = 0;
        for (int num : integers) {
            total += num;
       }
        double average = (double) total / integers.length;
        System.out.println("Sum: " + total);
        System.out.println("Average: " + average);
        sc.close();
    }
}

