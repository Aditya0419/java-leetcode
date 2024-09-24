import java.util.*;

public class BTzigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> li = new ArrayList<>();
            if(root == null) return li;
            Queue<TreeNode> s=new LinkedList<>();
            s.add(root);
            int level=0;
            while (!s.isEmpty()) {
                int size=s.size();
                List<Integer> li1=new ArrayList<>();
                for(int i=0;i<size;i++){
                    TreeNode temp=s.poll();
                    li1.add(temp.val);
                    if(temp.left!=null)s.add(temp.left);
                    if(temp.right!=null)s.add(temp.right);
                    level++;
                }
                if(level%2!=0) Collections.reverse(li1);
                li.add(li1);

            }
            return li;
    }
}
