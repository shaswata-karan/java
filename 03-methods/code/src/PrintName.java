// Write a function to print your name.

import java.util.*;

public class PrintName {
    public static void printMyName(String name) {
        System.out.println("Name is " +name);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printMyName(name); // function call
    }
}