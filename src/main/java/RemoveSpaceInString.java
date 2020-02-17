public class RemoveSpaceInString {

  /*  public String RemoveString(String inputString){

        String tempVar ="";
        char[] charArray = inputString.toCharArray();

        for ( int i =0; i <= inputString.length()-1;i++){

            if (charArray[i] != ' '){
                 tempVar = tempVar+charArray[i];
            }
        }
        return  tempVar;
    }
*
   */

    static String noSpace(final String x) {

        String tempVar = "";
        char[] charArray = x.toCharArray();

        for (int i = 0; i <= x.length() - 1; i++) {

            if (charArray[i] != ' ') {
                tempVar = tempVar + charArray[i];
            }
        }
        return tempVar;
    }
    public static void main (String[] args){

        RemoveSpaceInString objRemoveSpace = new RemoveSpaceInString();
        System.out.println(objRemoveSpace.noSpace("sdfjk ksjkf jkj"));
    }
}
