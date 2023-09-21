/*

Number Pyramid
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5

*/

public class Pattern11 {
    public static void main(String args[]) {

        int n = 1;

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print(n + " ");
                }
            }
            System.out.println();
            n++;

        }

    }
}