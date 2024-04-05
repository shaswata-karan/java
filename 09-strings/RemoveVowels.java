// Remove vowels from a String

import java.util.Scanner;

public class RemoveVowels {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String inputString = sc.nextLine();
    String result = removeVowels(inputString);
    System.out.println("String without vowels: " + result);
    sc.close();
  }

  public static String removeVowels(String str) {
    StringBuilder sb = new StringBuilder();
    for (char ch : str.toCharArray()) {
      if (!isVowel(ch)) {
        sb.append(ch);
      }
    }
    return sb.toString();
  }

  public static boolean isVowel(char ch) {
    ch = Character.toLowerCase(ch); // Handle both uppercase and lowercase vowels
    return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
  }
}
