public class PaiStar {

    public String PaiStar(String str) {
        String tempPai = "";

        for (int i = 0; i < str.length() - 1; i++) {
            if (((str.charAt(i) == str.charAt(i + 1)) )
            ) {
                tempPai = tempPai+str.charAt(i) + "*" + str.charAt(i + 1);}
                else  {
                    if (str.charAt(i) == str.charAt(i + 1) && tempPai.length()>2)
                      tempPai =  tempPai+"*" + str.charAt(i) + "*" + str.charAt(i + 1);
                }
            }
                return tempPai;
    }



    public static    void main(String[] str){

        PaiStar abc = new PaiStar();

        System.out.println(abc.PaiStar("bbb"));
    }
}
