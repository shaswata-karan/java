// Program to find Smallest and Largest Word in a String

//     Input : "This is a test string"
//     Output : Minimum length word: a
//     Maximum length word: string


public class WordLength {

  public static void main(String[] args) {
    String str = "Hardships often prepare ordinary people for an extraordinary destiny";

    // Initialize variables
    String smallest = "", largest = "";
    int minLength = Integer.MAX_VALUE, maxLength = 0;

    // Add extra space to handle the last word
    str = str + " ";

    // Iterate through the string character by character
    int start = 0;
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);

      // If a space is encountered, extract the current word
      if (ch == ' ') {
        String word = str.substring(start, i);
        int length = word.length();

        // Update smallest word
        if (length < minLength) {
          smallest = word;
          minLength = length;
        }

        // Update largest word
        if (length > maxLength) {
          largest = word;
          maxLength = length;
        }

        // Reset start index for next word
        start = i + 1;
      }
    }

    System.out.println("Smallest word: " + smallest);
    System.out.println("Largest word: " + largest);
  }
}