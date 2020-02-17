import java.util.regex.Pattern;

public class Abbreviator {

    public static String abbreviate(String string) {
        // ...
        int stringLenght = string.length();


        if (stringLenght==0)
            return null;
        else if (stringLenght==3){
            return string;}
        else if (!string.contains("-") || !Pattern.compile("[0-9]").matcher(string).find()){
            return string = Character.toString(string.charAt(0)) + (stringLenght - 2) + Character.toString(string.charAt(stringLenght - 1));
        }
            // Input: 'monolithic-mat5mat' expected:<m[8c-mat5ma]t> but was:<m[16]t>



      return string;

    }



public static void main(String[] args){
        String inputString = "monolithic-mat5mat";

        System.out.print(abbreviate(inputString));
}

}
/*

public String abbreviate(String s) {
        String[] words = s.split("[^a-zA-Z]+");
        String[] separators = s.split("[a-zA-Z]+");
        String result = "";

        int i = 1;
        for (String word : words) {
            result += processWord(word);
            if (i < separators.length) {
                result += separators[i++];
            }
        }
        return result;
    }

    private String processWord(String word) {
        if (word.length() < 4) return word;
        int n = word.length() - 2;
        return "" + word.charAt(0) + n + word.charAt(word.length() - 1);
    }
 */