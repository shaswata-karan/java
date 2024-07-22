import java.util.Scanner;
public class Factorial
{
    public static void main(String []args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        // factorial of 5 = 5*4*3*2*1
        // int n = 5;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact*i;
        }
        System.out.println("Factorial of " +n+ " is " +fact);
    }
}


// public class Factorial {

//     public static void main(String[] args) {
//         int n = 4;
//         int fact = 1;
//         while (n > 0) {
//             fact = fact*n;
//             n--;
//         }
//         System.out.println(fact);
//     }
// }