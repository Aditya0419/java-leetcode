import java.util.ArrayList;
import java.util.Arrays;

public class hIndex {
    public static int hIndex(int[] citations) {
        int res=0;

        ArrayList<Integer> dup=new ArrayList<>();

        Arrays.sort(citations);
        int i;
        for (i = 1; i <= citations.length; i++) 
            if(citations[citations.length-i]<i) break;
        return i-1;
        

        
    }
    public static void main(String[] args) {
        int[] arr={1,3,1};
        System.out.println(hIndex(arr));
    }
}
