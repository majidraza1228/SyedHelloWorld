import java.util.Arrays;

public class GiftSorter {
    public static String sortGiftCode(String code){
        //Put code here!
        if (code ==null)
            return null;

        char[]  GiftCodeChars = code.toCharArray();
        Arrays.sort(GiftCodeChars);
        return String.valueOf(GiftCodeChars);

            }
public  static void main(String[] args){
        System.out.print(sortGiftCode("avffhjaemviglfjfnddlmdsdjcfl"));


}


}
