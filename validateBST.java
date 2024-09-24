import java.util.ArrayList;

public class validateBST {
    ArrayList<Integer> ar=new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        inorder(root);
        for(int i=0;i<ar.size()-2;i++){
            if(ar.get(i)>=ar.get(i+1)) return false;
        }

        return true;
    }
    public void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        ar.add(root.val);
        inorder(root.right);
    }
}
