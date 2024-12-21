import java.util.Scanner;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[100]; // 7,1,5,3,6,4
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        int result = maxProfit(prices);
        System.out.println(result);
        sc.close();
    }


    public static int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if (prices[i] < prices[j]) {
                    int diff = prices[j] - prices[i];
                    if (diff>profit) {
                        profit = diff;
                    }
                }
            }
       }
       return profit;
    }
}
