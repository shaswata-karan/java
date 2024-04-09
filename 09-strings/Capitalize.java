// Capitalize first and last character of each word

import java.util.*;
public class Capitalize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        Words(input);
        sc.close();
    }

    // my name is shaswata
    public static void Words(String input) {
        String word = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                Capitalized(word);
                word = "";
                continue;
            }
            else {
                word = word + input.charAt(i);
            }
        }
        if (!word.isEmpty()) { // Check for the last word
            Capitalized(word);
            }
    }

    public static void Capitalized(String word) {
        String capitalized = "";
        for (int i = 0; i < word.length(); i++) {
            if(i == 0 || i == word.length()-1) {
                capitalized = capitalized + Character.toString(word.charAt(i)).toUpperCase();
            }
            else {
                capitalized = capitalized + word.charAt(i);
            }
        }
        System.out.print(capitalized + " ");
    }
}
