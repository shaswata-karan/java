// Write a method to calculate the product of 2 numbers.

import java.util.*;

public class Product {

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Product of the given numbers is: " + calculateProduct(a, b));
    }

    public static int calculateProduct (int a, int b) {
        return a*b;
    }
}