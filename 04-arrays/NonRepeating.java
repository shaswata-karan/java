// Given an array of integers of size N, the task is to find the first non-repeating element in this array. 

import java.util.Scanner;

public class NonRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of numbers you want to enter: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // 2,1,5,2,1,7

        int flag = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if (numbers[i] == numbers[j]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("output: " + numbers[i]);
                break;
            }
            flag = 0;
        }
        sc.close();
    }
}

