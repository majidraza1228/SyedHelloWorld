public class WriteSequence {

    public static void WriteSequence(int n) {
        if (n<1) {
            throw new IllegalArgumentException();
        } else if ( n ==1) {
            System.out.print("1");
        } else {
            System.out.print((n+1)/2+ "");
                    if (n!=2) {
                        WriteSequence(n-2);
                    }
        System.out.print((n+1)/2+"");
        }
    }

    public  static void main (String[] args){
        WriteSequence(21);
    }
}
