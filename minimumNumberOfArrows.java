import java.util.ArrayList;
import java.util.Arrays;

public class minimumNumberOfArrows {
    public int findMinArrowShots(int[][] points) {
        if(points.length == 0 || points.length==1) return points.length;

        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<int[]> ar=new ArrayList<>();
        ar.add(points[0]);

        for (int i = 1; i <= points.length; i++) {
            if (points[i][0]<ar.get(ar.size()-1)[1]) {
                ar.get(ar.size()-1)[1]=Math.min(ar.get(ar.size()-1)[1],points[i][1]);   
            }
            else{
                ar.add(points[i]);
            }
        }

        return ar.size();
    }
    public static void main(String[] args) {
        
    }
}
