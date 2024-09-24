import java.util.Hashtable;
import java.util.*;

public class LRUcache {
    Hashtable<Integer, Integer> ht;
    int capacity;
    LinkedList<Integer> keys = new LinkedList<>();
    ArrayList<Integer> keys1=new ArrayList<>();
    // Queue<Integer> key = new LinkedList<>();

    public void LRUCache(int capacity) {
        ht = new Hashtable<>(capacity);
        this.capacity = capacity;

    }

    public int get(int key) {
        if (ht.containsKey(key)){
            while(keys1.contains(key)){
                keys1.remove(keys1.indexOf(key));
            }
            keys1.add(key);
            return ht.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
        
        if (ht.containsKey(key)) {
            ht.put(key, value);
            keys1.add(key);
            while(keys1.contains(key)){
                keys1.remove(keys1.indexOf(key));
            }
        } else {
            if (ht.size() == capacity) {
                int k = keys1.remove(0);
                while(keys1.size()>0 && keys1.contains(key)){
                    keys1.remove(keys1.indexOf(key));
                }
                ht.remove(k);
                ht.put(key, value);
                keys1.add(key);
            }else{
                ht.put(key, value);
                keys1.add(key);
            }
        }
    }
}
