/*

Counting Primes
This question is asked by Google. Given a positive integer N, return the number of
prime numbers less than N.
Ex: Given the following N…

N = 3, return 1.
2 is the only prime number less than 3.
Ex: Given the following N…

N = 7, return 3.
2, 3, and 5 are the only prime numbers less than 7.

 */


public class DevByte68 {
    public static  int countPrimesLessThanN(int n) {

        boolean[] primes = new boolean[7];

        for ( int i =0 ;i <primes.length;i++){
            primes[i]=true;
        }

        for(int i = 2; i < Math.sqrt(n); i++) {
            if(primes[i]) {
                for(int j = i; j * i < primes.length; j++) {
                    primes[i * j] = false;
                }
            }
        }

        int primeCount=0;

        for (int i=2;i <primes.length;i++){

            if (primes[i]){
                primeCount++;
            }
        }

        return primeCount;
    }


    public static void main(String[] args){

        System.out.println(countPrimesLessThanN(7));

    }



}
