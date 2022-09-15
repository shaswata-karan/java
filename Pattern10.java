/*

Solid Rhombus
    *****
   *****
  *****
 *****
*****

*/

import java.util.*;

public class Pattern10 {
    public static void main(String args[]) {
        System.out.println("hi");
        int k = 9;

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <=k; j++) {
                if(j<i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
            k--;

        }

    }
}