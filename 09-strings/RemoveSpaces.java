// Remove spaces from a given string

import java.util.*;
public class RemoveSpaces {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String inputString = sc.nextLine();
    String result = removeSpaces(inputString);
    System.out.println("String without spaces: " + result);
    sc.close();
    }

    public static String removeSpaces(String inputString) {
        String newString = "";
        for (char ch : inputString.toCharArray()) {
            if (ch != ' ') {
                newString += ch;
            }
        }
        return newString;
    }
}
