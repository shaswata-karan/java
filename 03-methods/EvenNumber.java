// Write a method to check if a given number is even.

import java.util.*;

class EvenNumber {
    public static boolean evenNumber (int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if(evenNumber(n))
            System.out.print("The number is even");
        else
            System.out.print("The number is odd");
            sc.close();
    }
}