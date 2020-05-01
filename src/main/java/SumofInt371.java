/*

Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
Example 1:

Input: a = 1, b = 2
Output: 3

    1 0 0 1
 +  0 0 1 1
    =========

 */


public class SumofInt371 {


    public static int Sum( int a, int b ){
       if ( b==0) return a;

       int partialSum = a ^ b;
       int carry = ( a & b) <<1;
       return Sum(partialSum,carry);


    }

    public static void main (String[] args){

        System.out.println(Sum(5,5));

    }
}
