public class SumofDifference2 {

    public static int sumOfDifferences(int[] arr) {
        if (arr.length < 2) {
            return 0;
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return max - min;
    }

    public static void main(String[] args){

        int[] a ={ 3,4,-1,3};

        System.out.print(sumOfDifferences(a));
    }
}
