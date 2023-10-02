// Write a method to check if a given number is Armstrong.
// Write a method to print all 3 digit Armstrong numbers.

import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a 3 digit no. to check whether it is an armstrong no. or not -> ");
    int n = sc.nextInt();
    sc.close();
    
    boolean ans = Armstrong(n);
    System.out.println(ans);
       
    System.out.print("All 3 digit Armstrong numbers: ");
    for (int i = 100; i < 1000; i++) {
        if (Armstrong(i)) {
            System.out.print(i + " ");
            }
        }
    }

    static boolean Armstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }
        return sum == original;
    }
}
