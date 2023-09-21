// Write a method to calculate the sum of 2 numbers.

import java.util.*;

public class Sum
{

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a and b: ");
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int sum = calculateSum(a,b); // function call
        System.out.print("Sum of two numbers is: " + sum);
        sc.close();
    }

    static int calculateSum(int a, int b) {
        return a+b;
    }
}