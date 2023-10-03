// search the key-element in 2D array
import java.util.Scanner;

public class SearchInMatrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        // input
        System.out.println("Input values:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // output
        System.out.println("Output matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // function call
        System.out.println("Enter key: ");
        int key = sc.nextInt();
        SearchElement(matrix, key);

        sc.close();
    }

    // method to find key-element
    public static boolean SearchElement(int matrix[][], int key) {
        System.out.println("Output matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Element found at cell: " + "[" + i + "]" + "[" + j +"]");
                    return true;
                }
            }
        }
        System.out.println("Element not found!");
        return false;
    }
    
}
