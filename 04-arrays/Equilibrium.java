import java.util.Scanner;

class Equilibrium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.print("Enter an array to find Equilibrium index: ");
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Input: A[] = {-7, 1, 5, 2, -4, 3, 0} 
        // Output: 3 

        // Array sum
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + arr[i];
        }

        // find equi
        int sum1 = 0;
        int sum2 = 0;
        int flag = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                sum1 = sum1 + arr[j];
            }
            sum2 = sum - sum1 - arr[i];
            if (sum1 == sum2) {
                System.out.println("eqi is: " + (i+1));
                flag = 1;
                break;
            }
            sum1 = 0;
            sum2 = 0;
        }
        if (flag == 0) {
            System.out.println("Eqi is: -1");
        }

        sc.close();
    }
}