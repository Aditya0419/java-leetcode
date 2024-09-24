import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrderBT {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> li = new ArrayList<>();
        if (root==null) return li;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> li1 = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();

                li1.add(curr.val);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            li.add(li1);
        }

        return li;
    }

    public static void main(String[] args) {

    }
}
