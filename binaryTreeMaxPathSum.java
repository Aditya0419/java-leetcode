public class binaryTreeMaxPathSum {
    int cs=0;
    int ms=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root==null) return 0;
        helper(root);
        return ms;
    }
    public int helper(TreeNode root){
        if(root==null) return 0;
        int l=Math.max(0,helper(root.left));
        int r=Math.max(0,helper(root.right));
        cs=Math.max(root.val+l+r,Math.max(l, r));
        ms=Math.max(cs, ms);
        return Math.max(l,r)+root.val;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        binaryTreeMaxPathSum obj=new binaryTreeMaxPathSum();
        System.out.println(obj.maxPathSum(root));
    }
}
