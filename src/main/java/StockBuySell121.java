/*
If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.

Example 1:

Input: [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
             Not 7-1 = 6, as selling price needs to be larger than buying
 */

public class StockBuySell121 {

    public static int maxProfit(int[] prices) {

        int max_profit = 0;
        int min_price ;

        min_price= prices[0];

        for ( int i =0; i < prices.length;i++){
            if ( prices[i] < min_price){
                    min_price=prices[i];
            } else if ( max_profit <prices[i] -min_price){
                        max_profit= prices[i] - min_price;
            }

        }
          return max_profit;
    }

public static void main(String[] args){

        int[] inputPrices = {7,1,5,3,6,4};

        System.out.println(maxProfit(inputPrices));

}

}
