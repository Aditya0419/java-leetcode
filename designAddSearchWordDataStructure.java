class Node {
    Node children[] = new Node[26];
    boolean isEndOfWord = false;

    Node() {
        for (int i = 0; i < 26; i++) {
            children[i] = null;
        }
    }
}

class WordDictionary {
    Node root;

    public WordDictionary() {
        root = new Node();
    }

    public void addWord(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.isEndOfWord = true;
    }

    public boolean search(String word) {
        Node curr = root; 
        return searchhelper(word, curr, 0);
    }

    public boolean searchhelper(String word, Node curr, int i) {
        if (i == word.length()) {
            return curr.isEndOfWord;
        }
        if (word.charAt(i) == '.') {
            for (int j = 0; j < 26; j++) {
                if (curr.children[j] != null && searchhelper(word, curr.children[j], i + 1)) {
                    return true;
                }
            }
        }else{
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx]==null) return false;
            return searchhelper(word, curr.children[idx], i + 1);
        }
        return true;
    }
}

public class designAddSearchWordDataStructure {
    public static void main(String[] args) {
        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        System.out.println(wordDictionary.search("pad")); // return False
        System.out.println(wordDictionary.search("bad")); // return True
        System.out.println(wordDictionary.search(".ad")); // return True
    }
}

