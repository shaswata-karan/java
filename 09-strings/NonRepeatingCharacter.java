// Non Repeating Character

import java.util.*;
public class NonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        checkRepeat(input);
        sc.close();
    }

    // input:shaswata output:h
    public static void checkRepeat(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i+1; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(input.charAt(i));
                break;
            }
            count = 0;
        }
    }
}