import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class copyLLwithRandom {
    public static Node copyRandomList(Node head) {
        Node curr = head;
        Node head1 = new Node(-1);
        Node curr2 = head1;
        HashMap<Node, Node> hm = new HashMap<>();

        while (curr != null) {
            if (curr.next == null) {
                curr2.val = curr.val;
                hm.put(curr, curr2);
                break;
            }
            curr2.val = curr.val;
            hm.put(curr, curr2);
            System.out.println(hm+ " "+curr2.val);
            curr = curr.next;
            curr2.next = new Node(-1);
            curr2 = curr2.next;
        }

        curr2 = head1;
        curr = head;
        while (curr2 != null) {
            curr2.random = hm.get(curr.random);
            curr = curr.next;
            curr2 = curr2.next;
        }

        curr2 = head1;
        while (curr2 != null) {
            System.out.println(curr2.val+" "+curr2.random);
            curr2 = curr2.next;
        }

        return head1;
    }

    public static void main(String[] args) {
        Node head = new Node(3);
        Node n1 = new Node(3);
        Node n2 = new Node(3);
        // Node n3 = new Node(10);
        // Node n4 = new Node(1);
        head.next = n1;
        n1.next = n2;
        // n2.next = n3;
        // n3.next = n4;
        head.random = null;
        n1.random = head;
        n2.random = null;
        // n3.random = n2;
        // n4.random = head;

        copyRandomList(head);

    }
}


// Node head = new Node(7);
//         Node n1 = new Node(13);
//         Node n2 = new Node(11);
//         Node n3 = new Node(10);
//         Node n4 = new Node(1);
//         head.next = n1;
//         n1.next = n2;
//         n2.next = n3;
//         n3.next = n4;
//         head.random = null;
//         n1.random = head;
//         n2.random = n4;
//         n3.random = n2;
//         n4.random = head;