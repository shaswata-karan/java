import java.util.Scanner;

public class Stringgg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check length: ");
        String input = sc.nextLine();
        int length = input.length();
        System.out.println("Length of the string is: "+length);
        sc.close();
    }
}
