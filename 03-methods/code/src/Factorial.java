// Write a method to calculate factorial of a number.

import java.util.*;

public class Factorial {
    public static void printFactorial(int n) {
        //loop
        if(n < 0) {
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;

        for(int i=n; i>=1; i--) {
            factorial = factorial * i;
        }

        System.out.println("Factorial is: " +factorial);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        printFactorial(n);
    }
}