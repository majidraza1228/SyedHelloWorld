/*
Work Schedule
You are given an array of interval objects, which each consist of a start time
and an end time. Each interval object represents when a particular meeting starts and ends. Return whether or not someone could attend every meeting.

Ex: Given the following intervals...

intervals = [[1, 3], [5, 10]], return true.
Ex: Given the following intervals...


intervals = [[1, 8], [5, 9]], return false.

1,5,8,9
 */

import java.util.Arrays;

public class DevByte86 {

    public static boolean workSchedule(Interval[] intervals) {

        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];

        for ( int i =0;i <intervals.length;i++){
            start[i] = intervals[i].start;
            end[i] = intervals[i].end;

        }

        Arrays.sort(start);
        Arrays.sort(end);

        for ( int i =0;i <start.length-1;i++){

            if (start[i+1] < end[i]){
                return false;
            }

        }
            return true;
    }

    public static void main(String[] args){


        Interval[] input = new Interval[4];
        input[0] = new Interval(1, 3);
        input[1] = new Interval(5, 10);


        System.out.println(workSchedule(input) );

    }
}
