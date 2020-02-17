public class ArrayplusArray {

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        // arr1 + arr2 is not working...

         int sumArray = 0;

         for (int i =0; i<=arr1.length-1;i++){
                sumArray= sumArray+arr1[i];
         }

        for (int j =0; j<=arr2.length-1;j++){
            sumArray= sumArray+arr2[j];
        }

        return sumArray;
    }

    public static void main(String[] args){
        int[] a={-1,-2,-3};
        int[] b= {-4,-5,-6};

        System.out.print(arrayPlusArray(a,b));

    }

}
