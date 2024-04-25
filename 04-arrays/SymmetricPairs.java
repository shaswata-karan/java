import java.util.Scanner;

public class SymmetricPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("how many pairs: ");
        int pair = sc.nextInt();

        int arr[][] = new int[pair][2];
        for (int i = 0; i < pair; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // check
        int temp[][] = new int[pair][2]; 
        for (int i = 0; i < pair; i++) {
            for (int j = i+1; j < pair; j++) {
                if (arr[i][0] == arr[j][1]
            && arr[i][1] == arr[j][0]) {
          System.out.print("(");
          System.out.print(arr[i][0]);
          System.out.print(", ");
          System.out.print(arr[i][1]);
          System.out.print(")");
          System.out.print("\n");
        }
            }
        }

        sc.close();

    }
}
