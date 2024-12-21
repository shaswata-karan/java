import java.util.Scanner;

public class SumOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int result = SumOfSquareOfFunction(n);
        System.out.println(result);
        sc.close();
    }

    public static int SumOfSquareOfFunction(int n) {
        int sum = 0;
        while (n>0) {
            int m = n%10;
            sum = sum + m*m;
            n = n/10;
        }
        return sum;
    }
}
