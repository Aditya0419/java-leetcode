public class mergeSortedArrays{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointerM=m-1;
        int pointerN=n-1;
        for (int i = m+n-1; i >=0 ; i--) {
            if(nums1[pointerM]<nums2[pointerN]){
                nums1[i]=nums2[pointerN];
                pointerN--;
            }
            else{
                nums1[i]=nums1[pointerM];
                pointerM--;
            }
        }
    }
    public static void main(String[] args) {
       
    }
}