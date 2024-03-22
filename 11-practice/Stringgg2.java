import java.util.*;

public class Stringgg2 {
    // input = My name is Shaswata Karan
    // output = name
    // Shaswata
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                continue;
            }
            System.out.println(input.charAt(i));
        }
        sc.close();
    }
}
