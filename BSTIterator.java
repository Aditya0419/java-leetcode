import java.util.ArrayList;

public class BSTIterator {
    TreeNode root;
    int pointer=-1;
    ArrayList<TreeNode> arr=new ArrayList<>();
    public BSTIterator(TreeNode root) {
        this.root=root;
        inorder(root);
    }
    
    public int next() {
        pointer++;
        return arr.get(pointer).val;
    }
    
    public boolean hasNext() {
        if(pointer<arr.size()-1) return true;
        return false;
    }
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        arr.add(root);
        inorder(root.right);
    }
}
