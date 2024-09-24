import java.util.LinkedList;
import java.util.Stack;

public class flattenBTtoLL {
    Stack<Integer> s=new Stack<>();
    public void flatten(TreeNode root) {
        if(root==null) return;
        preorder(root);
        TreeNode curr=root;
        if(!s.isEmpty())
            s.pop();
        while(!s.isEmpty()) {
            curr.right = new TreeNode(s.pop());
            curr.left = null;
            curr=curr.right;
        }
            
    }

    public void preorder(TreeNode root){
        if(root==null) return;

        preorder(root.right);
        preorder(root.left);
        s.push(root.val);
    }

    public static void printTreePreOrder(TreeNode root){
        if(root==null){
            System.out.print(-1+" ");
            return;
        }
        System.out.print(root.val+" ");
        printTreePreOrder(root.left);
        printTreePreOrder(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);
        flattenBTtoLL obj = new flattenBTtoLL();
        obj.flatten(root);
        printTreePreOrder(root);

    }
}
