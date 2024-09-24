public class constructBT {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left=null;
            this.right=null;
        }
    }
    static int idx=-1;
    public static Node constructTree(int[] nodes){
        idx++;
        if(nodes[idx]==-1){
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = constructTree(nodes);
        newNode.right=constructTree(nodes);

        return newNode;
    }
    public static void printTreePreOrder(Node root){
        if(root==null){
            System.out.print(-1+" ");
            return;
        }
        System.out.print(root.data+" ");
        printTreePreOrder(root.left);
        printTreePreOrder(root.right);
    }
    public static void printTreeInOrder(Node root){
        if(root==null){
            System.out.print(-1+" ");
            return;
        }
        printTreeInOrder(root.left);
        System.out.print(root.data);
        printTreeInOrder(root.right);
    }
    public static int findHeight(Node root){
        if(root==null){
            return 0;
        }
        return Math.max(findHeight(root.left),findHeight(root.right))+1;
    }
    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=constructTree(nodes);
        printTreePreOrder(root);
        System.out.println();
        printTreeInOrder(root);
        System.out.println();
        System.out.println(findHeight(root));
    }
}
