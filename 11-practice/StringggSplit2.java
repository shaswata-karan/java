import java.util.Scanner;

public class StringggSplit2 {
    // input = my name is shaswata karan
    // output = name shaswata
    // input = Hi I am learning computer science and I love it
    // output = I learning science I it
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String[] word = input.split(" ");
        for (int i = 0; i < word.length; i++) {
            if (i%2 != 0) {
                System.out.println(word[i]);
            } 
        }
        sc.close();
    }    
}
