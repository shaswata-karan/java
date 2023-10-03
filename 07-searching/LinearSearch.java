// Take an array as input from user. Search for a given number x and print the index where it occurs.

import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int array[] = new int[size];

        // input
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        // user inputs the element he wants to search
        System.out.print("Enter the number you want to search: ");
        int x = sc.nextInt();

        // output
        for (int i = 0; i < size; i++) {
            if (array[i] == x) {
                System.out.println("Element found at index: " + i);
            }
        }
        sc.close();
    }
}
