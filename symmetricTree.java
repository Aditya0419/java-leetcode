public class symmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isSymmetricRec(root.left, root.right);
    }
    public static boolean isSymmetricRec(TreeNode left,TreeNode right){
        if(left==null && right==null) return true;
        if(left==null || right==null) return false;
        if(left.val!=right.val) return false;
        return isSymmetricRec(left.left,right.right) && isSymmetricRec(left.right,right.left);
    }
    public static void main(String[] args) {
        
    }
}
