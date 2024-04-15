// Convert characters of a string to opposite case

import java.util.Scanner;

public class ConvertCharacters {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String inputString = sc.nextLine();

    StringBuilder sb = new StringBuilder();
    for (char c : inputString.toCharArray()) {
      char oppositeCaseChar;
      if (Character.isLowerCase(c)) {
        oppositeCaseChar = (char) (c - 32); // Convert to uppercase (ASCII difference)
      } else if (Character.isUpperCase(c)) {
        oppositeCaseChar = (char) (c + 32); // Convert to lowercase (ASCII difference)
      } else {
        oppositeCaseChar = c; // Keep non-alphabetic characters unchanged
      }
      sb.append(oppositeCaseChar);
    }

    System.out.println("Opposite Case: " + sb.toString());

    sc.close();
  }
}
