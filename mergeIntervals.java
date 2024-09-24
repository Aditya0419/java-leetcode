import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeIntervals {
    public static int[][] merge(int[][] intervals) {
        if(intervals.length==0 || intervals.length==1) return intervals;

        Arrays.sort(intervals,(a,b)->Integer.compare(a[0], b[0]));
        List<int[]> res = new ArrayList<>();
        res.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            System.out.println(intervals[i-1][1]+" "+intervals[i][0]);
            if (res.get(res.size()-1)[1]>=intervals[i][0]) {
                res.get(res.size()-1)[1]=Math.max(res.get(res.size()-1)[1],intervals[i][1]);
            }else{
                res.add(intervals[i]);
            }
        }

        // for (int i = 0; i < res.size(); i++) {
        //     System.out.print(Arrays.toString(res.get(i))+" ");
        // }
        return res.toArray(new int[res.size()-1][]);
    }

    public static void main(String[] args) {
        int[][] arr = { {4,5}, {2,4} ,{4,6} ,{3,4}, {0,0},{1,1}, {3,5} ,{2,2} };

        System.out.println(Arrays.toString(merge(arr)));
    }
}

//cases
// { 1, 3 }, { 2, 6 }, { 5, 9 }, { 8, 15 }, { 16, 19 } 
//{1,3},{2,6},{8,10},{15,18}
// {1,4},{0,0}
//{1,3}, {2,6} ,{8,10} ,{8,9}, {9,11},{15,18}, {2,4} ,{16,17}




//my app
// if(intervals.length==0 || intervals.length==1) return intervals;

//         List<List<Integer>> res = new ArrayList<List<Integer>>();
//         int[] start = new int[intervals.length];
//         int[] end = new int[intervals.length];
//         for (int i = 0; i < intervals.length; i++) {
//             start[i] = intervals[i][0];
//             end[i] = intervals[i][1];
//         }

//         Arrays.sort(start);
//         Arrays.sort(end);

//         for (int i = 0; i < end.length - 1; i++) {
//             if (end[i] >= start[i + 1]) {

//                 if (res.size() > 0 && res.get(res.size() - 1).get(1) >= start[i]) {
//                     res.get(res.size() - 1).set(1, end[i + 1]);
//                 } else {
//                     res.add(Arrays.asList(start[i], end[i + 1]));
//                 }
//             } else if (!(end[i] > start[i + 1]) && i + 1 == end.length - 1) {
//                 if (res.size()>0 && (res.get(res.size() - 1).get(1) == end[i])) {
//                     res.add(Arrays.asList(start[i + 1], end[i + 1]));
//                 } else {
//                     res.add(Arrays.asList(start[i], end[i]));
//                     res.add(Arrays.asList(start[i + 1], end[i + 1]));
//                 }
//             } else {
//                 if (res.size()>0 && (res.get(res.size() - 1).get(1) == end[i])) {
//                     continue;
//                 }
//                 res.add(Arrays.asList(start[i], end[i]));
//             }
//         }
//         int[][] res2 = new int[res.size()][2];
//         for (int i = 0; i < res.size(); i++) {
//             res2[i][0] = res.get(i).get(0);
//             res2[i][1] = res.get(i).get(1);
//         }
//         return res2;