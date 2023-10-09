package pratice_section.Array_QUS;

import java.util.Arrays;
import java.util.Comparator;

//merge overlapping intervals
public class Q21 {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,4},{6,8},{9,10}};
        print(mergeIntervals(intervals));
    }
    static int[][] mergeIntervals(int[][] intervals){
        //
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(final int[] entry1, final int[] entry2) {
                if(entry1[0] < entry2[0]){
                    return -1;
                }else return 1;
            }

        });
        int pos = 0;
        for(int i = 1;i < intervals.length;i++){
            if( intervals[pos][1] >= intervals[i][0]){
                intervals[pos][1] = Math.max(intervals[pos][1], intervals[i][1]);
            }else {
                intervals[++pos] = intervals[i];
            }
        }
        int[][] result = new int[pos+1][2];
        for(int i = 0;i <= pos;i++){
            result[i] = intervals[i];
        }
        return result;
    }
    public static  void print(int[][] interval){
        for(int[] item : interval){
            System.out.print("{"+item[0]+","+item[1]+"}"+" ");
        }
    }
}
