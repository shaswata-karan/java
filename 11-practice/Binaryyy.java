import java.util.Scanner;

public class Binaryyy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine()); // Total number of elements, reading as a whole line
        String[] line = scanner.nextLine().split(" "); // Elements as a string array
        int level = Integer.parseInt(scanner.nextLine()); // Level for sum calculation
        int sum = 0, start = (int) Math.pow(2, level - 1) - 1;
        int end = Math.min((int) Math.pow(2, level) - 1, N);

        for (int i = start; i < end; i++) {
            sum += Integer.parseInt(line[i]);
        }

        System.out.println(sum);
        scanner.close(); // It's a good practice to close the scanner
    }
}