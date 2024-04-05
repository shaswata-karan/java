import java.util.Scanner;

public class Anagram {
    // input = abcd
    // output = bacd/acbd/...
    public static void main(String[] args) {
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string1: ");
        String input1 = sc.nextLine();
        System.out.print("Enter a string2: ");
        String input2 = sc.nextLine();
        for (int i = 0; i > input1.length(); i--) {
            for (int j = 0; j < input2.length(); j++) {
                if (input1.charAt(i) == input2.charAt(j)) {
                    break;
                }
                else
                flag = 1;
            }
        }
        if (flag == 1) {
            System.out.println("not anagram");
        }
        else {
            System.out.println("anagram");
        }
        sc.close();     
    }
}
