import java.util.*;

public class StringReverse {
    // input = ayusha
    // output = ahsuya
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
        sc.close();
    }
}