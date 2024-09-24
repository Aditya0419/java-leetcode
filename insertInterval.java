import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class insertInterval {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length==0) return new int[][]{newInterval};
        List<int[]> li = new ArrayList<>();
        boolean inserted = false;

        for (int i = 0; i < intervals.length; i++) {
            System.out.println(i+" "+Arrays.toString(intervals[i])+inserted);
            if (!inserted && newInterval[0] < intervals[i][0]) {
                if (li.size() > 0 && li.get(li.size() - 1)[1] >= newInterval[0]) {
                    li.get(li.size() - 1)[1] = Math.max(li.get(li.size()- 1)[1], newInterval[1]);
                } else {
                    li.add(newInterval);
                }
                i=i-1;
                inserted = true;
            }else{
                if(li.size() > 0 && li.get(li.size() - 1)[1] >= intervals[i][0]){
                    li.get(li.size() - 1)[1] = Math.max(li.get(li.size()- 1)[1], intervals[i][1]);
                }else{
                    li.add(intervals[i]);
                }
            }
            for (int j = 0; j < li.size(); j++) {
                System.out.print(Arrays.toString(li.get(j)));
            }
            System.out.println();
        }

        if(!inserted){
            if (li.size() > 0 && li.get(li.size() - 1)[1] >= newInterval[0]) {
                li.get(li.size() - 1)[1] = Math.max(li.get(li.size()- 1)[1], newInterval[1]);
            } else {
                li.add(newInterval);
            }
        }


        for (int i = 0; i < li.size(); i++) {
            System.out.print(Arrays.toString(li.get(i)));
        }

        return li.toArray(new int[li.size() - 1][]);

    }

    public static void main(String[] args) {
        int[][] intervals = {{3,5},{8,10}};
        int[] newInterval = { 1,2};
        insert(intervals, newInterval);
    }
}

// { 1, 3 }, { 6, 9 }
// { 2, 5 }
