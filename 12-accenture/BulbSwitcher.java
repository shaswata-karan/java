import java.util.Scanner;

public class BulbSwitcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = 0;
        }
        int result = bulbSwitch(n, arr);
        System.out.println(result);
        sc.close();
    }

    public static int bulbSwitch(int n, int[] arr) {
        // round1
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        // round2
        for (int i = 0; i < arr.length; i++) {
            if (i%2 == 1) {
                arr[i]=0;
            }
        }

        // round3
        for (int i = 0; i < arr.length; i++) {
            if (i%3 == 2) {
                if (arr[i] == 0) {
                    arr[i] = 1;
                }
                else {
                    arr[i] = 0;
                }  
            }
        }

        // nth round
        // if (arr[n-1] == 0) {
        //     arr[n-1] = 1;
        // }
        // else {
        //     arr[n-1] = 0;
        // }

        // count
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                count++;
            }
        }

        return count;
    }
}
