public class MiddleCharacter {
    public static String getMiddle(String word) {
                //Code goes here!

        int wordLength = word.length();

        if (wordLength == 0 || wordLength <=2)
            return word;

         int EvenOdd =  wordLength/2;
         int wordstart = wordLength/2;

        if (wordLength% 2==0){
            return  word.substring(wordstart-1,wordstart+1);
        }
        else {

            return  word.substring(wordstart,wordstart+1);


        }
    }


    public static void main(String args[]){

        System.out.print(getMiddle("middle"));
}
}
