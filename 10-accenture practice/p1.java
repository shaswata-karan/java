import java.util.Scanner;
public class p1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();

            // SumOfSquare
            int SumOfSquare = 0;
            for (int i = 1; i <= N; i++) {
                SumOfSquare += i;
            }
            SumOfSquare = SumOfSquare * SumOfSquare;

            // SquareOfSum
            int SquareOfSum = 0;
            for (int i = 1; i <= N; i++) {
                SquareOfSum += i*i;
            }

            // Output
            System.out.println(SumOfSquare - SquareOfSum);
        }
        sc.close();
    }
}
