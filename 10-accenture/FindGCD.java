import java.util.Scanner;

public class FindGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // no of numbers in the array
        int[] nums = new int[n]; // [2,5,6,9,10]
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int result = GCD(nums);
        System.out.println(result);
        sc.close();
    }

    public static int GCD(int[] nums) {
        int small = 1000;
        int great = 0;
        // smallest no
        for (int i = 0; i < nums.length; i++) {
            if (small > nums[i]) {
                small = nums[i];
            }
        }

        // greatest no
        for (int i = 0; i < nums.length; i++) {
            if (great < nums[i]) {
                great = nums[i];
            }
        }

        // System.out.println(small);
        // System.out.println(great);

        // gcd
        int gcd=1;
        for (int i = small; i > 0; i--) {
            if (small%i == 0 && great%i == 0) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }
}