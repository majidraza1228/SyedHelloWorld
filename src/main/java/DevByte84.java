/*

Given an array integers, prices, where each values represents the price
 of
a stock on the ith day, return the maximum profit you can make making a single transaction (i.e. one buy and one sell) of one share of stock.

Ex: Given the following prices...

prices = [8, 9, 2, 3, 5, 2, 4], return 3.
Ex: Given the following prices...

prices = [10, 8, 3, 1], return 0.
 */

public  class DevByte84 {

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for ( int i =0 ;i <prices.length;i++){
                if (prices[i] <minPrice){
                    minPrice=prices[i];
                }
                else if (prices[i]-minPrice >maxProfit ){
                    maxProfit= prices[i]-minPrice;
                }

        }

            return maxProfit;

    }

    public static void main(String[] args){

        int[] input= {0, 8, 3, 1};
        System.out.println( maxProfit(input));

    }
}
