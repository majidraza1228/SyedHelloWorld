

public class Bio {

    public static String dnaToRna(String dna) {
        String Rna="";
       if (dna.contains("T") || dna.contains("t"))
       {
          Rna= dna.replace('T','U');
           Rna =Rna.replace('t','u');

           return Rna;
       }
       else {

           return dna;  // Do your magic!

       }
    }

public static void main(String args[]){

        System.out.print(dnaToRna("GCAT"));
}

}
