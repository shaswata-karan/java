// Write a function to check if a given number n is even or not.

import java.util.*;

public class Even {
    public static boolean evenNumber (int n) {
        if(n%2 == 0)
            return true;

        else
            return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(evenNumber(n) == true)
            System.out.println("The number is even");

        else
            System.out.println("The number is odd");

    }
}