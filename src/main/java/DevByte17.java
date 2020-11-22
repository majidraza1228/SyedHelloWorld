/*

// i.e. the moving average has a capacity of 3.
MovingAverage movingAverage = new MovingAverage(3);
m.next(3) returns 3 because (3 / 1) = 3
m.next(5) returns 4 because (3 + 5) / 2 = 4
m.next(7) = returns 5 because (3 + 5 + 7) / 3 = 5
m.next(6) = returns 6 because (5 + 7 + 6) / 3 = 6
 */

public class DevByte17 {

public static class MovingAverage {
    int[] stream;
    int size;
    int insert;
    int sum;

    public MovingAverage( int size){
         stream = new int[size];
         size=0;
         insert=0;
         sum=0;
    }

    public double next(int val){

        if (size < stream.length){
            size++;
        }

        sum -= stream[insert];
        sum += val;
        stream[insert++] = val;

        insert %= stream.length;
        return (double) sum /size;
    }

}


    public static void main(String[] args){
        MovingAverage movingAverage = new MovingAverage(3);


        System.out.print(movingAverage.next(3));
        System.out.print(movingAverage.next(5));
        System.out.print(movingAverage.next(7));
        System.out.print(movingAverage.next(6));
    }
}
