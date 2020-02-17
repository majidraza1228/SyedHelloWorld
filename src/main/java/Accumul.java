public class Accumul {

    public static String accum(String s) {
        // your code
        if (s.length() == 0)
            return s;
        String inputStringChar = "";
        for (int i = 0; i < s.length(); i++) {
            inputStringChar += GetString((s.charAt(i)),i+1);
            if (i<s.length()-1)
                inputStringChar +="-";
        }
        return inputStringChar;
    }

    private static String GetString(char inputchar, int charpoistion) {
        String getString = "";
        for (int i = 1; i <= charpoistion; i++) {
            if (i == 1)
                getString = Character.toString(inputchar).toUpperCase();
            else
                getString += Character.toString(inputchar).toLowerCase();
        }

        return getString;

    }
    public  static void main (String[] args){

System.out.print(accum("abcd"));
    }
}
/*
accum("abcd") -> "A-Bb-Ccc-Dddd"
accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") -> "C-Ww-Aaa-Tttt"

 */