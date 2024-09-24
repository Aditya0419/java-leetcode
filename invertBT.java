public class invertBT {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;

        TreeNode newNode=new TreeNode();
        newNode.left=invertTree(root.right);
        newNode.right=invertTree(root.left);
        return newNode;
    }
    public static void main(String[] args) {
        
    }
}
