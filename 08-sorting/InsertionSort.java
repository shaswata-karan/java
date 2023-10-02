public class InsertionSort {

    public static void sorting(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            int prev = i-1;
            int curr = arr[i];
            //finding out the current position to insert
            while(prev>=0 && arr[prev]>curr) {
                arr[prev+1] = arr[prev];
                prev --;
            }
            arr[prev+1]=curr;
        }
    }

    public static void printArr(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};
        sorting(arr);
        printArr(arr);
    }
}