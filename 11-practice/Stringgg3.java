import java.util.Scanner;

public class Stringgg3 {
    // input = this is a java language program
    // output = this is java language
    // input = hello there this is me
    // output = this is me
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String[] word = input.split(" ");
        for (int i = 0; i < word.length; i++) {
            if (word[i].length() % 2 == 0) {
                System.out.print(word[i]+" ");
            }
        }
        sc.close();
    }      
}
