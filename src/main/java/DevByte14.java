/*

"LR", return true
"URURD", return false
"RUULLDRD", return true

L complements R and U complements D (complements meaning “undoes”).
 */

public class DevByte14 {

    public static boolean vacumReturnToStart(String s){

        int LR=0;
        int UD=0;
        for ( int i=0;i <s.length();i++){

            char inputCommand = s.charAt(i);

            if ( inputCommand=='L')
                LR++;
            else if (inputCommand=='R')
                LR--;
            else if (inputCommand=='U')
                UD++;
            else if (inputCommand=='D')
                UD--;
        }

         return LR==0 && UD==0;
    }

public static void main(String args[]){

        System.out.println(vacumReturnToStart("URURD"));
}

}
