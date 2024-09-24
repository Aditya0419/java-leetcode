import java.util.ArrayList;

public class kthSmallestInBST {
    ArrayList<Integer> a=new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        if(root==null) return 0;
        inorder(root);
        return a.get(k-1);
    }
    public void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        a.add(root.val);
        inorder(root.right);
    }
}
