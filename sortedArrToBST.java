public class sortedArrToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root=build(nums,0,nums.length-1);
        return root;
    }
    public TreeNode build(int[] nums,int si,int ei){
        if(si>ei) return null;
        int mid=(si+ei)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=build(nums,si,mid-1);
        root.right=build(nums,mid+1,ei);
        return root;
    }
    public static void printTreePreOrder(TreeNode root){
        if(root==null){
            return;
        }
        
        printTreePreOrder(root.left);
        System.out.print(root.val+" ");
        printTreePreOrder(root.right);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        sortedArrToBST obj = new sortedArrToBST();
        TreeNode root = obj.sortedArrayToBST(arr);
        printTreePreOrder(root);
    }
}
