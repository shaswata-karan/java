import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // array size n=7
        int[] arr = new int[n]; //array initialize -> [1,2,3,4,5,6,7]
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        newArray(n, arr, k);
        sc.close();
    }

    public static void newArray(int n, int[] arr, int k) {

        int[] tempo = new int[n];
        for (int i = 0; i < arr.length; i++) {
            tempo[i] = arr[i];
        }

        int[] toStoreK = new int[k];
        for (int i = 0; i < k; i++) {
            toStoreK[i] = arr[(n-k)+i];
        }

        for (int i = 0; i < k; i++) {
            arr[i] = toStoreK[i];
        }

        int j = 0;
        for (int i = k; i < n; i++) {
            arr[i] = tempo[j];
            j++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
