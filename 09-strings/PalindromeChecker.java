// Given String is Palindrome or not

public class PalindromeChecker {

  public static void main(String[] args) {
    String text = "Race car";
    if (isPalindrome(text)) {
      System.out.println(text + " is a palindrome");
    } else {
      System.out.println(text + " is not a palindrome");
    }
  }

  public static boolean isPalindrome(String text) {
    text = text.toLowerCase(); // Convert to lowercase for case-insensitive check

    StringBuilder sb = new StringBuilder();
    for (char ch : text.toCharArray()) {
      if (Character.isLetterOrDigit(ch)) {  // Only consider letters and digits
        sb.append(ch);
      }
    }

    String cleanText = sb.toString();
    int n = cleanText.length();
    for (int i = 0; i < n / 2; i++) {
      if (cleanText.charAt(i) != cleanText.charAt(n - 1 - i)) {
        return false;
      }
    }
    return true;
  }
}
