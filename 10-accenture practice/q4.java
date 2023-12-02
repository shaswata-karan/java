import java.util.Scanner;

class q4 {
    
    public static boolean isSquareFree(int n) {
        // If n is even, make n = n/2, this will reduce the number of our loop iterations.
        if (n % 2 == 0)
            n = n / 2;
        
        // If 2 divides n again, it is not a square free number.
        if (n % 2 == 0)
            return false;
        
        // Now n must be odd. So we can iterate only over the odd numbers.
        for (int k = 3; k <= Math.sqrt(n); k = k + 2) {
            // if k is a factor.
            if (n % k == 0) {
                n = n / k;
                
                // If i divides n again, n is not a square free number.
                if (n % k == 0)
                    return false;
            }
        }
        return true;
    }

    public static int countNumbers(int n) {
        // final ans.
        int count = 0;
        
        // loop till square root of n to count the square-free divisors.
        for (int i = 2; i <= Math.sqrt(n); i++) {
            // If i is a divisor of n.
            if (n % i == 0) {
                // if i is square-free.
                if (isSquareFree(i))
                    count++;
                
                if (isSquareFree(n / i))
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countNumbers(n));
        sc.close();
    }
}