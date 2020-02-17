public class LCFString {

    static String lcs(String a, String b) {

       char[] aCharacters = a.toCharArray();
       char[] bCharacters = b.toCharArray();
       String lcfString="";

       for ( int i=0; i<a.length()-1; i++){
           for (int j=0; j< b.length()-1; j++){

               if (aCharacters[i]==bCharacters[j]){
                   lcfString= lcfString+aCharacters[i];
               }
           }
       }

        return lcfString; // do it!
    }

    public static void main(String[] args){

        System.out.println(lcs("anothertest","notatest"));
    }
}
