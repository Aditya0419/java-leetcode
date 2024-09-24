public class diameterOfBT {
    public static int findHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(findHeight(root.left),findHeight(root.right))+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;

        int leftD=diameterOfBinaryTree(root.left);
        int lefth=findHeight(root.left);
        int rightD=diameterOfBinaryTree(root.right);
        int righth=findHeight(root.right);

        int selfD=lefth+righth+1;

        return Math.max(selfD,Math.max(leftD,rightD));
    } 
    public static void main(String[] args) {
        
    }
}
