import java.util.Scanner;

public class NumToBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int n = sc.nextInt(); // n=546
        String bit = "";
        while (n>0) {
            int rem = n%2;
            n = n/2;
            bit = rem + bit;
        }
        System.out.print("Output : "+bit);
        sc.close();
    }
}