// Write a method to print table of a given number.

import java.util.*;

public class Table {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        printTable(num);
    }

    public static void printTable(int num) {
        System.out.println("Table");
        System.out.println("-----");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}