// Program for array left rotation by d positions.
// Input:
// arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2
// Output: 3 4 5 6 7 1 2

// Input: arr[] = {3, 4, 5, 6, 7, 1, 2}, d=2
// Output: 5 6 7 1 2 3 4

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an array: ");
        int numbers[] = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter breakpoint: ");
        int d = sc.nextInt();

        // temprary array
        int temp[] = new int[5];
        int k = 0;

        // array1
        for (int i = d; i < numbers.length; i++) {
            temp[k] = numbers[i];
            k++;
        }

        // array 2
        for (int i = 0; i < d; i++) {
            temp[k] = numbers[i];
            k++;
        }

        // concatenate
         for (int i = 0; i < 5; i++) {
            numbers[i] = temp[i];
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[i]+" ");
        }

        sc.close();
    }
}