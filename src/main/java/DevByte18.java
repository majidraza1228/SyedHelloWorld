/*
Max Points
This question is asked by Google. You are given a bag of coins, an initial energy of E , and want to maximize your number of points (which starts at zero). To gain a single point you can exchange coins[i] amount of energy (i.e. if I have 100 energy and a coin that has a value 50 I can exchange 50 energy to gain a point). If you do not have enough energy you can give away a point in exchange for an increase in energy by coins[i] amount (i.e. you give away a point and your energy is increased by the value of that coin: energy += coins[i]). Return the maximum number of points you can gain. Note: Each coin may only be used once.

Ex: Given the following coins and starting energy…

coins = [100, 150, 200] and E = 150, return 1
coins = [100,200,300,400] and E = 200, return 2
coins = [300] and E = 200, return 0
 */


import java.util.Arrays;

public class DevByte18 {

    public static int maxPoints(int[] coins, int E) {

        Arrays.sort(coins);

        int maxPoint=0;
        int points=0;
        int i=0;
        int j = coins.length-1;

        while (i<=j){

            if (E >=coins[i]){
                    points++;
                    E-= coins[i++];
                    maxPoint=Math.max(maxPoint,points);
            } else if (points>0){
                points--;
                E+=coins[j--];
            } else {
                    return maxPoint;
                    }
        }
        return maxPoint;
    }


public static void main(String[] args){

        int[] coins={100, 150, 200};
        int E = 150;

        System.out.println(maxPoints(coins,E));


}


}
