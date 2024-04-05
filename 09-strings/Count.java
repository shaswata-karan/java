// Count vowels, consonants, digits, and special characters in a string

import java.util.*;
public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        countCharacters(str);
        sc.close();
    }

    public static void countCharacters(String str) {
    int vowelCount = 0;
    int consonantCount = 0;
    int digitCount = 0;
    int specialCharCount = 0;
    str = str.toLowerCase();  // Convert to lowercase for case-insensitive counting
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (isVowel(ch)) {
        vowelCount++;
      } else if (isConsonant(ch)) {
        consonantCount++;
      } else if (Character.isDigit(ch)) {
        digitCount++;
      } else {
        specialCharCount++;
      }
    }
    System.out.println("Vowels: " + vowelCount);
    System.out.println("Consonants: " + consonantCount);
    System.out.println("Digits: " + digitCount);
    System.out.println("Special Characters: " + specialCharCount);
  }

  public static boolean isVowel(char ch) {
    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
  }

  public static boolean isConsonant(char ch) {
    return (ch >= 'a' && ch <= 'z') && !isVowel(ch);
  } 
}
