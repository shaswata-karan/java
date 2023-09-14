// Write a function to print the table of a given number n.

import java.util.*;

public class Table {
    public static void printTable(int num) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        printTable(num);
    }
}
