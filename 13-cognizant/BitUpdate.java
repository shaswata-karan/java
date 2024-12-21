import java.util.Scanner;

public class BitUpdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("z1: ");
        int z1 = sc.nextInt();
        System.out.print("z2: ");
        int z2 = sc.nextInt();
        System.out.print("z3: ");
        int z3 = sc.nextInt();

        int x1 = ((z1-5)/2);
        int x2 = ((z2-5)/2);
        int x3 = ((z3-5)/2);

        int rem1 = 0;
        String bit1 = "";
        while (x1>0) {
            rem1 = x1%2;
            x1 = x1/2;
            bit1 = rem1+bit1;
        }
        System.out.print("Bit of x1: ");

        int rem2 = 0;
        String bit2 = "";
        while (x2>0) {
            rem2 = x2%2;
            x2 = x2/2;
            bit2 = rem2+bit2;
        }
        System.out.print("Bit of x2: ");

        int rem3 = 0;
        String bit3 = "";
        while (x3>0) {
            rem3 = x1%2;
            x3 = x3/2;
            bit3 = rem3+bit3;
        }
        System.out.print("Bit of x3: ");

        

        sc.close();
    }
}
