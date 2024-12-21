import java.util.Arrays;
import java.util.Scanner;
public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("String1 : ");
        String s1 = sc.nextLine();
        System.out.println("String2 : ");
        String s2 = sc.nextLine();

        // check length
        if (s1.length() == s2.length()) {

            // lower case
            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();

            // to char array
            char[] a1 = s1.toCharArray();
            char[] a2 = s2.toCharArray();

            // sort
            Arrays.sort(a1);
            Arrays.sort(a2);

            boolean result = Arrays.equals(a1, a2);

            // result
            if (result==true) {
                System.out.println("Given string is anagram");
            }
            else
            System.out.println("Given string is not anagram");
        }
        else {
            System.out.println("Given string is not anagram");
        }
        sc.close();
    }
}