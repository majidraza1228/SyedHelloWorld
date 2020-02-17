public class SquareN {

    public static int squareSum(int[] n) {
        //Your Code
        int sumsq = 0;

        for ( int number:n)
            sumsq += number* number;
/*
        for (int i = 0; i < n.length; i++) {

            sumsq = sumsq + (n[i] * n[i]);
        }
*/
        return sumsq;
    }

    public static void main(String[] args){

        int[] a={5,-3,4};

        System.out.print(squareSum(a));

    }

}
