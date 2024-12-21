public class absdiff {
    public static void main(String[] args) {
        int[] arr = {12, 3, 14, 56, 77, 13};
        int length = arr.length;
        int num = 13;
        int diff = 2;
        System.out.println(findCount(arr, length, num, diff));
    }

    public static int findCount(int arr[],int length, int num,int div) {
        int count=0;
        for (int i = 0; i < length; i++) {
            if(num-arr[i]<=2 && num-arr[i]>=-2)
                count++;
        }
        return count;
    }
}