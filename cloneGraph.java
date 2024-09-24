import java.util.*;
import java.util.List;

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
public class cloneGraph {
    

    HashMap<Integer,Node> visited=new HashMap<>();
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        Node newH=new Node();
        newH.val=node.val;
        visited.put(newH.val,newH);
        for (int i = 0; i < node.neighbors.size(); i++) {
            if(!visited.containsKey(node.neighbors.get(i).val)){
                cloneGraph(node.neighbors.get(i));
            }
        }
        for (int i = 0; i < node.neighbors.size(); i++) {
            newH.neighbors.add(visited.get(node.neighbors.get(i)));
        }
        return newH;
    }

    // public Node helper(Node node,ArrayList<Node> visited){

    // }

    public static void main(String[] args) {
        
    }
}
