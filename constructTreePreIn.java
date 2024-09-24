class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class constructTreePreIn {
    static int idx = 0;

    public static TreeNode build(int[] preorder,int[] inorder,int si,int ei){
        if(si>ei) return null;
        if(idx==preorder.length) return null;
        int curr = 0;
        for (int i = 0; i < ei; i++) {
            System.out.println(i+" "+idx);
            if (inorder[i] == preorder[idx]) {
                curr = i;
                break;
            }
        }
        TreeNode root = new TreeNode(preorder[idx++]);
        root.left = build(preorder,inorder,si,curr-1);
        root.right = build(preorder,inorder,curr+1,ei);

        return root;
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root=build(preorder, inorder, 0, inorder.length);

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
        int[] pre = { 3,9,20,15,7 };
        int[] in = { 9,3,15,20,7 };

        
        printTreePreOrder(buildTree(pre, in));
    }
}
