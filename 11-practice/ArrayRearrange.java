// N=7
// K=3
// ARR=[1,2,3,4,5,6,7]
// O/P 
// ARR=[5,6,7,1,2,3,4]

// N=7
// K=2
// ARR=[1,2,3,4,5,6,7]
// O/P 
// ARR=[6,7,1,2,3,4,5]

import java.util.Scanner;

public class ArrayRearrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // no of array numbers
        System.out.println("Enter " + n + " numbers");
        int k = sc.nextInt(); // value of k
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(result);
        sc.close();
    }

    public static int rearrange(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length-k; j < nums.length; j++) {
                if (nums[j] > nums[j+1]) {
                    count++;
                }
            }
        }
        return prevCount;
    }
}