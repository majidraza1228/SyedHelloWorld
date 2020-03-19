import javax.swing.plaf.synth.SynthTextAreaUI;

public class PowerofTwo231 {

    public static boolean isPowerOfTwo(int n) {

        int i =1;

        while (i<n){

            i *=2;

        }

        return i==n;
    }


    public static void main(String[] args){

        System.out.print(isPowerOfTwo(16));

    }

}
