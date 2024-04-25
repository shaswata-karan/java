// Print array after it is right rotated K times
// Input: Array[] = {1, 3, 5, 7, 9}, K = 2.
// Output: 7 9 1 3 5
// Explanation:
// After 1st rotation – {9, 1, 3, 5, 7}After 2nd rotation – {7, 9, 1, 3, 5}

// Input: Array[] = {1, 2, 3, 4, 5}, K = 4.
// Output: 2 3 4 5 1

import java.util.Scanner;

public class RightRotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();

        System.out.println("Enter the array elements: ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Arrray Right Rotation K times. Where K = ");
        int k = sc.nextInt();

        int temp[] = new int[size];
        int t = 0;

        for (int i = k+1; i < size; i++) {
            temp[t] = arr[i];
            t++;
        }

        for (int i = 0; i <= k; i++) {
            temp[t] = arr[i];
            t++;
        }

        for (int i = 0; i < size; i++) {
            arr[i] = temp[i];
        }

        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
