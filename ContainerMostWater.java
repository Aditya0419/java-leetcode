public class ContainerMostWater {
    public static int maxArea(int[] height) {
        int si=0;
        int ei=height.length-1;
        int area=0;
        int maxres=0;
        while (si<ei) {
            area=Math.min(height[si], height[ei])*(ei-si);
            // System.out.println(area);
            maxres=Math.max(maxres, area);

            if(height[si]<height[ei]) si++;
            else ei--;

        }

        return maxres;
    }
    public static void main(String[] args) {
        int[] arr={1,1};
        System.out.println(maxArea(arr));
    }
}
