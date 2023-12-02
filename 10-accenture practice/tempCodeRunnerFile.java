public class q4 {
    public static void main(String[] args) {
        int n = 72;
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && isnotPerfectSquare(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isnotPerfectSquare(int number) {
        for (int i = 1; i * i <= number; i++) {
            if (i * i == number) {
                return false;
            }
        }
        return true;
    }
}
