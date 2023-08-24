package Sorting;
import java.util.Arrays;
import java.util.Comparator;

public class OverlappingIntervals {
    public static void main(String[] args){
        int[][] Intervals = {{1,3},{2,4},{6,8},{9,10}};
        overlappedInterval(Intervals);
    }

    public static int[][] overlappedInterval(int[][] intervals)
    {
        //creating a pair using Pair class created in order to sort the array according to start time.
        Pair[] pairs = new Pair[intervals.length];
        for(int i = 0; i < intervals.length ; i++){
            pairs[i] = new Pair(intervals[i][0], intervals[i][1]);
        }
        Arrays.sort(pairs);

        int res = 0;

        //for every interval
        for(int i = 1; i < intervals.length; i++){
//            checking if the end time for the first interval is greater than the start time of the ith pair
            if(pairs[res].et >= pairs[i].st){
//                merge the intervals
                pairs[res].st = Math.min(pairs[res].st, pairs[i].st);
                pairs[res].et = Math.max(pairs[res].et, pairs[i].et);
            }
            // else copy the next non overlapping interval to next to res.
            else{
                res++;
                pairs[res] = pairs[i];
            }
        }

        for(int i = 0; i <= res; i++){
            System.out.println(pairs[i].st + " " + pairs[i].et);
        }
        //adding pairs back to a matrix
        int[][] result = new int[res+1][2];
        for(int i = 0; i <= res; i++) {
            result[i][0] = pairs[i].st;
            result[i][1] = pairs[i].et;
        }
        return result;
    }

    public static class Pair implements Comparable<Pair>{
        int st;
        int et;

        Pair(int st, int et){
            this.st = st;
            this.et = et;
        }

        @Override
        public int compareTo(Pair other) {
            if(this.st != other.st){
                return this.st - other.st;
            }
            else{
                return this.et - other.et;
            }
        }
    }
}
