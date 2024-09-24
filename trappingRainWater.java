import java.util.Arrays;

public class trappingRainWater {
    
    public static int trap(int[] height) {
        int water=0;

        int leftMax=0,rightMax=0;
        int[] leftBound=new int[height.length];
        int[] rightBound=new int[height.length];

        for (int i = 0; i < height.length; i++) {
            leftMax=Math.max(leftMax, height[i]);
            rightMax=Math.max(rightMax,height[height.length-i-1]);
            leftBound[i]=leftMax;
            rightBound[height.length-i-1]=rightMax;
        }
        for (int i = 0; i < height.length; i++) {
            water+=(Math.min(leftBound[i],rightBound[i])-height[i]);
        }
        return water;
    }
    public static void main(String[] args) {
        int[] arr={4,2,0,3,2,5};
        trap(arr);
        System.out.println(trap(arr));
    }
}
