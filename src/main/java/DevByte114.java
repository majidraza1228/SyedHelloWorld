/*
Stock Market
Given an array integers, prices, where each values represents the price of a stock on
the ith day, return the maximum profit you can make making a single transaction
 (i.e. one buy and one sell) of one share of stock.

Ex: Given the following prices...

prices = [8, 9, 2, 3, 5, 2, 4], return 3.
Ex: Given the following prices...

prices = [10, 8, 3, 1], return 0.
 */
import javax.management.RuntimeErrorException;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.io.FileWriter;
import java.io.IOException;



public class DevByte114 {
    public static int stockMarket(int[] prices) {

        int maxprofit = 0;
        int min = prices[0];

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < min) {
                min = prices[i];
            } else {
                maxprofit = Math.max(maxprofit, prices[i] - min);
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) throws IOException {

        int[] input = {8, 9, 2, 3, 5, 2, 4};
        System.out.println(stockMarket(input));
/*
        URL url =new URL("https://en.wikipedia.org/w/api.php?action=parse&section=0&prop=text&format=json&page=pizza");
        HttpURLConnection wikiConn = (HttpURLConnection) url.openConnection();
        wikiConn.setRequestMethod("GET");
        wikiConn.setRequestProperty("Accept", "application/json");

       String out="";
        BufferedReader br = new BufferedReader(new InputStreamReader(wikiConn.getInputStream()));
            while ((out= br.readLine()) !=null){
                System.out.println(out);
            }

*/
    }


}