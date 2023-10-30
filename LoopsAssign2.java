package program;
import java.util.Scanner;
public class LoopsAssign2{
    public static void main(String[] args) {
        int[] integers = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {					//Taking 10 inputs
        	System.out.print("Enter "+ i +" number: ");
            integers[i] = sc.nextInt();
        }
        int sm = integers[0];
        int lg = integers[0];
        for (int n : integers) {
            if (n < sm) {			//if statement for minimum number
                sm = n;
            }
            if (n > lg) {			//if statement for maximum number
                lg = n;
            }
            sc.close();
       }
        System.out.println("Minimum value: " + sm);
        System.out.println("Maximum value: " + lg);
    }

}
