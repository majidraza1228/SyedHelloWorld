package com.coveros.demo.helloworld;

public class RemoveChars {
    public static String remove(String str) {

        // your code here
        String removeStrings="";
         char[] c;

        if (str.length()==0)
            return "N/A";
        c= str.toCharArray();

        for(int k=0; k < str.length()-1; k++){

            if ( k== 0 || k == str.length()-1){
                } else  {
                 removeStrings= removeStrings+c[k];}
}
       return removeStrings;

                }

              public static void main(String[] args)   {

        RemoveChars obj = new  RemoveChars();

        System.out.println(obj.remove("place"));

              }


}
