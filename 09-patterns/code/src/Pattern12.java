/*

Palindromic Pattern
        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5

*/

import java.util.*;

public class Pattern12 {
    public static void main(String args[]) {

        int n = 5;

        for (int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //1st Half Numbers
            for(int j=i; j>=1; j--) {
                System.out.print(j);
            }

            //2nd Half Numbers
            for(int j=2; j<=i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

    }
}