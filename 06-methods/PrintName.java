// Write a method to print your name.

import java.util.*;

public class PrintName {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        printMyName(name); // function call
        sc.close();
    }

    public static void printMyName(String name) {
        System.out.println("Name is " +name);
        return;
    }
}