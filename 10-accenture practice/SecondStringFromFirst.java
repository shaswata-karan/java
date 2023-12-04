import java.util.Scanner;

public class SecondStringFromFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int[] count = new int[256];

        if (isPossible(count, str1, str2)) {
            System.out.println("possible");
        }
        else {
            System.out.println("not possible");
        }
        
        sc.close();
    }

    public static boolean isPossible(int[]count, String str1, String str2) {

        char[] st3 = str1.toCharArray();
        for (int i = 0; i < st3.length; i++) {
            count[st3[i]]++;
        }

        char[] st4 = str2.toCharArray();
        for (int i = 0; i < st4.length; i++) {
            if (count[st4[i]]==0) {
                return false;
            }
            count[st4[i]]--;
        }
        return true;
    }
}
