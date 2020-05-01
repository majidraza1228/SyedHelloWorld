
import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRoom253 {

    public static int minMeetingRooms(Interval[] intervals) {

        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals, (a, b) -> a.start - b.end);
        PriorityQueue<Interval> minHeap = new PriorityQueue<>((a, b) -> a.end - b.end);

        minHeap.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {

            Interval current = intervals[i];
            Interval earliest = minHeap.remove();
            if (current.start >= earliest.end) {
                earliest.end = current.end;
            } else {
                minHeap.add(current);
            }
            minHeap.add(earliest);
        }
       return minHeap.size();

    }

    public static void main (String[] args){

        Interval arr[]=new Interval[3];
        arr[0]=new Interval(0,30);
        arr[1]=new Interval(5,10);
        arr[2]=new Interval(15,20);


     System.out.println(minMeetingRooms(arr));

    }
}