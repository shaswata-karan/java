import java.util.Scanner;

public class StringggSplit {
    // input = my name is abc
    // output =
    // my
    // name
    // is
    // abc
    /*
    String word = input.split(" ");
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String[] word = input.split(" ");
        for (int i = 0; i < word.length; i++) {
            System.out.println(word[i]);
        }
        sc.close();
    }
}
