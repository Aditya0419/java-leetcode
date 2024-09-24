import java.util.ArrayList;

public class sumRootToLeaf {
    public int sumNumbers(TreeNode root) {
        return traverseDFS(root, 0);
    }

    public int traverseDFS(TreeNode root,int num) {
        if (root == null) return 0;

        num=num*10+root.val;
        if (root.left == null && root.right == null) return num;
        
        return traverseDFS(root.left, num)+traverseDFS(root.right, num);
    }

    public static void main(String[] args) {

    }
}