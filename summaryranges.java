import java.util.ArrayList;
import java.util.List;

public class summaryranges {
    public List<String> summaryRanges(int[] nums) {
        List<String> li = new ArrayList<>();
        int si = 0;
        for (int i = 0; i < nums.length; i++) {
            si = i;
            while (i < nums.length - 1 && nums[i+1]-nums[i]==1) {
                i++;
            }
            if (si == i) {
                System.out.println("hi");
                li.add(String.valueOf(nums[si]));
            } else {
                li.add(String.valueOf(nums[si]) + "->" + String.valueOf(nums[i]));
            }
        }

        return li;
    }
    public static void main(String[] args) {
        summaryranges s = new summaryranges();
        int[] nums = {0,2,3,4,6,8,9};
        System.out.println(s.summaryRanges(nums));
    }
}
