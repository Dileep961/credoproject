package com.math;
import java.util.Scanner;
public class For {
////    public static void main(String[] args) {
//    	int n;
//       Scanner sc = new Scanner(System.in);
//       System.out.println("enter your a number");
//   	n = sc.nextInt();
//   	int f = 1 ;
//        for (int i = 1; i <=n; i++) {
//        	f = f*i ;
//        }
//            System.out.println("the factorial is     "    + f);
//    }
//}
	

    public static void main(String[] args) {
        int n = 10; // Number of terms in the Fibonacci sequence
        System.out.println("Fibonacci series up to " + n + " terms:");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    // Method to compute Fibonacci numbers using recursion
    public static int fibonacci(int n) {
        if (n <= 1) { // Base case
            return n;
        }
        // Recursive case: Sum of the two preceding numbers
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}