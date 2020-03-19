/*
A defanged IP address replaces every period "." with "[.]".
Example 1:
Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
 */

public class defangIPaddr1108 {

    public static String defangIPaddr(String address) {

        StringBuilder result = new StringBuilder();

        for (int i =0; i < address.length();i++){

            char current = address.charAt(i);

            if (current =='.')
                result.append("[.]");
            else
                result.append(current);
        }
        return result.toString();
    }

public static void main(String[] args) {

        System.out.print(defangIPaddr("1.1.1.1"));

}
}
