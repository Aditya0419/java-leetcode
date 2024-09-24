public class pathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return helper(root, 0, targetSum);
    }
    public boolean helper(TreeNode root,int sum,int targetSum){
        if(root==null){
            return false;
        }
        sum=sum+root.val;   
        if(root.left==null && root.right==null){
            if(sum==targetSum){
                return true;
            }
        }
            
        return helper(root.left, sum, targetSum) || helper(root.right, sum, targetSum);
    }
    public static void main(String[] args) {
        
    }
}
