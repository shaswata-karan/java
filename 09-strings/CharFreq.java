// Frequency of characters in a string

import java.util.*;
public class CharFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        isCharacterCount(s);
        sc.close();
    }

    public static void isCharacterCount (String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                count++;
            }
            else {
                count = count + 0;
            }
        }
        System.out.println("Character count is: " +count);
    }
}
