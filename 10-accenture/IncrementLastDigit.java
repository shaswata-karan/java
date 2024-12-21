import java.util.Scanner;

public class IncrementLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No is: ");
        int n = sc.nextInt();
        int rem = n%10;
        int q = n/10;
        int newNumber = (q*10) + rem + 1;
        System.out.println(newNumber);
        sc.close();
    }
}
