// Write a function to check if a number is prime or not.

import java.util.*;

public class Prime {
    public static boolean primeCheck(int n) {

        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
            return isPrime;
        }

        else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            return isPrime;

        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("The number is:"+ primeCheck(n));

    }
}
