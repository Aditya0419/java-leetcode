class Node{
    Node children[] = new Node[26];
    boolean isEndOfWord = false;
    Node(){
        for(int i=0;i<26;i++){
            children[i] = null;
        }
    }
}
public class Trie {
    Node root;
    public Trie() {
        root = new Node();
    }
    
    public void insert(String word) {
        Node curr=root;
        for(int lvl=0;lvl<word.length();lvl++){
            int index = word.charAt(lvl)-'a';
            if(curr.children[index]==null){
                curr.children[index] = new Node();
            }
            curr=curr.children[index];
        }
        curr.isEndOfWord = true;
    }
    
    public boolean search(String word) {
        Node curr=root;
        for (int i = 0; i < word.length(); i++) {
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
        return curr.isEndOfWord==true;
    }
    
    public boolean startsWith(String prefix) {
        Node curr=root;
        for (int i = 0; i < prefix.length(); i++) {
            int idx=prefix.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
        return true;
    }
}
