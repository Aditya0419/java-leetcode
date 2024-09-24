import java.util.*;

public class BTRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> li = new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return li;
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode temp=q.poll();
                if(i==size-1) li.add(temp.val);
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null)q.add(temp.right);
            }
        }
        return li;
    }
}
