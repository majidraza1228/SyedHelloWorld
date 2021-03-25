/*

Final Digit
Given a non-negative integer, num, repeatedly add all its digits until it has a single digit
remaining and return it.

Ex: Given the following num...

num = 123, return 6 (1 + 2 + 3 = 6)
Ex: Given the following num...

num = 8353, return 1 (8 + 3 + 5 + 3 = 19 = 1 + 9 = 10 = 1 + 0 = 1).

 */

public class DevByte108 {
    public static  int finalDigit(int num) {

        while (num  >=10){
            int next =0;

            while (num >0){
                next += (num %10);
                num /=10;
            }
                num=next;
        }

        return num;

    }

  public static void main(String[] args){

        System.out.println(finalDigit(123));


  }

}
