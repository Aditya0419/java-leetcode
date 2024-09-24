public class BTfromInPost {
    static int idx=0;
    public TreeNode build(int[] inorder , int[] postorder, int si, int ei){
        if(si>ei) return null;
        if(idx==postorder.length) return null;
        int curr=0;
        System.out.println("si "+si+" ei "+ei);
        for(int i=si;i<=ei;i++){
            System.out.println(i+" "+(postorder.length-1-idx));
            if(inorder[i]==postorder[postorder.length-1-idx]){
                curr=i;
                break;
            }
        }
        TreeNode root = new TreeNode(postorder[postorder.length-1-idx++]);
        System.out.println("rooooot "+root.val);
        root.right = build(inorder, postorder, curr+1, ei);
        root.left = build(inorder, postorder, si, curr-1);
        

        return root;

    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        TreeNode root=build(inorder, postorder, 0, inorder.length-1);

        return root;
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
        int[] inorder = {8,9,3,15,20,7};
        int[] postorder = {8,9,15,7,20,3};
        BTfromInPost obj = new BTfromInPost();
        TreeNode root = obj.buildTree(inorder, postorder);
        printTreePreOrder(root);
    }
}
