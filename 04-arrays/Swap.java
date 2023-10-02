import java.util.Arrays;

class Swap {
    public static void main(String[] args) {
        int arr[] = {1,9,22,18,77};
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
    }

    static void swap (int arr[], int index1, int index3) {
        int temp = 0;
        temp = arr[index1];
        arr[index1] = arr[index3];
        arr[index3] = temp;
    }
}