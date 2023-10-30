package program;

import java.util.Scanner;

public class LargeSmallNoInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc = new Scanner(System.in);
	        System.out.print("\nEnter 10 numbers: ");
	    	//int n = sc.nextInt();
	        int arr[]=new int[10];
	        for(int i=0; i<10; i++){
	            System.out.print("\nEnter number "+i+":");
	            arr[i] =sc.nextInt();
	        }
	        //for loop for large numbers and small numbers
	        int large = arr[0];
	        int smallest=arr[0];
	        for (int i = 0; i < 10; i++) {
	            if (arr[i] > large) {
	                large = arr[i];
	            }if (arr[i] < smallest) {
	                smallest = arr[i];
	            }
	        }
	  
	        System.out.print("Numbers inside the array: ");
	        for (int i = 0; i < 10; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println("\nlargest number: " + large);
	        System.out.println("\nsmallest number: " + smallest);

	        sc.close();
	    }
	    }
