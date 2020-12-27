/*
Add Binary
"100" + "1", return "101"
"11" + "1", return "100"
"1" + "0", return  "1"
 */



public class DevByte31 {

    public String addBinary(String a, String b) {

        StringBuilder result = new StringBuilder();

        int i = a.length()-1;
        int j = b.length()-1;
        int carry =0;

        while ( i >0 || j>0){

            int sum =carry;

            if( i >=0){
                sum +=a.charAt(i--)+'0';
            }
            if (j >= 0) {
                sum += b.charAt(j--)+'0';
            }
                result.append(sum %2);
                carry = sum/2;
        }

        if (carry!=0){
            result.append(1);
        }
            return result.reverse().toString();
    }

    public static void main(String[] args){

        int[] A={-1000,1,-2,1000};

        int ans=0;

        for(int i=1;i<A.length;i++){
            if (ans >= A[i]){
                ans=A[i];
            }
        }

        System.out.println(ans);

    }

}
