import java.util.ArrayList;
import java.util.Arrays;

public class shortestDistanceAfterRoadAddition {
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        int[] res=new int[queries.length];
        int dist=Integer.MAX_VALUE;
        for (int i = 0; i < queries.length; i++) {
            dist=Math.min(dist-queries[i][1]+queries[i][0]+1>0?(dist-queries[i][1]+queries[i][0]+1):(n-queries[i][1]+queries[i][0]),Math.min(dist,n-queries[i][1]+queries[i][0]));
            res[i]=dist;
        }
        System.out.println(res);
        return res;
    }
    public static void main(String[] args) {
        shortestDistanceAfterRoadAddition obj=new shortestDistanceAfterRoadAddition();
        int n=5;
        int[][] queries={{2,4},{0,2},{0,4}};
        int[] res=obj.shortestDistanceAfterQueries(n, queries);
        System.out.println(Arrays.toString(res));
    }
}
