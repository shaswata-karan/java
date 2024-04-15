// Sort string of characters

import java.util.Arrays;
import java.util.Scanner;

public class SortString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);
        System.out.println(charArray);
        sc.close();
    }
}
