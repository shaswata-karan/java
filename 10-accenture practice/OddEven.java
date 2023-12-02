import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numver to check odd or even : ");
        int n = sc.nextInt();
        if (n%2==0) {
            System.out.println("Even Number");
        }
        else if (n%2 == 1) {
            System.out.println("Odd Number");
        }
        else
            System.out.println("Invalid input");
        sc.close();    
    }
}
