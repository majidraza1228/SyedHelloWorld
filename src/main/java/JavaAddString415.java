public class JavaAddString415 {

    public static String addStrings(String num1, String num2) {

    StringBuilder result = new StringBuilder();

    int i = num1.length()-1;
    int j = num2.length()-1;
    int carry =0;

    while (i >=0 || j>=0){

        int sum = carry;

    if (i >=0){
        sum  += num1.charAt(i--) -'0';
    }

    if (j >=0){
            sum  += num2.charAt(j--) -'0';
        }

     result.append(sum % 10);
     carry = sum /10;

    }
if (carry !=0){
    result.append(carry);
}

return result.reverse().toString();

    }

    public static void main (String[] args){

        String n1 = "150";
        String n2 = "151";

        System.out.print(addStrings(n1,n2));

    }

}
