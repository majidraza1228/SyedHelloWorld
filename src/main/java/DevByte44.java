/*

appetite = [1, 2, 3], cake = [1, 2, 3], return 3.
Ex: Given the following arrays appetite and cake…

appetite = [3, 4, 5], cake = [2], return 0.

 */


import java.util.Arrays;

public class DevByte44 {

    public static int distributeCake(int[] appetite, int[] cake) {
        Arrays.sort(appetite);
        Arrays.sort(cake);

        int count=0;
        int cak=0;
        int appe=0;

        while ( cak < cake.length &&  appe < appetite.length){

            if (cake[cak] >= appetite[appe]){
                 count++;
                 cak++;
                 appe++;
            } else{
                cak++;
            }
        }

        return count;

    }
    public static void main(String[] args){

        int cake[] ={1, 2, 3};
        int appetite[] = {1, 2, 3};

        System.out.println(distributeCake(appetite,cake));


    }


}
