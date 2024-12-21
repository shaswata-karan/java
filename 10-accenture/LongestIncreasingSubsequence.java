import java.util.Scanner;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // no of numbers user wants to input
        int[] nums = new int[n]; // [10,9,2,5,3,7,101,18]
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int result = lengthOfLIS(nums);
        System.out.println(result);
        sc.close();
    }

    public static int lengthOfLIS(int[] nums) {
        int count = 1;
        int prevCount = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                if (nums[j] > nums[j+1]) {
                    count++;
                }
            }
            if (prevCount < count) {
                prevCount = count;
                }
                count=1; 
        }
        return prevCount;
    }
}