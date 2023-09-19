// Write a method to check whether a given number is prime.

import java.util.*;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check whether it is prime or not -> ");
        int n = sc.nextInt();
        boolean ans = IsPrime(n);
        System.out.println(ans);
    }

    static boolean IsPrime (int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while( c * c < n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
