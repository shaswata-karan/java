import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       int[] reversedArr = reversed(arr, n);
        System.out.print("The reversed array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(reversedArr[i] + " ");
        }
        sc.close();
    }

    public static int[] reversed (int arr[], int n) {
        int[] reversed = new int[n];
            for (int i = n-1; i >= 0; i--) {
                reversed[i] = arr[n - i - 1];
            }
            return reversed;
        }
}
