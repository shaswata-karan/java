public class p3 {
    public static void main(String[] args) {
        int a = 4;
        int b = 20;
        System.out.println(difference(a, b));
    }

    public static int difference(int n,int m) {
        // Sum of numbers divisible by 4
        int sum1 = 0;
        for (int i = 0; i <= m; i++) {
            if (i%n == 0) {
                sum1 += i;
            }
        }

        // Sum of numbers not divisible by 4
        int sum2 = 0;
        for (int i = 0; i <= m; i++) {
            if (i%n != 0) {
                sum2 += i; 
            }
        }
        int difference = sum2-sum1;
        return difference;
    }
}