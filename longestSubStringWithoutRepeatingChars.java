import java.util.ArrayList;
import java.util.Hashtable;

public class longestSubStringWithoutRepeatingChars {

    //simple and easy 
    // public int lengthOfLongestSubstring(String s) {
    //     int res = 0;
    //     Hashtable<Character, Integer> tab = new Hashtable<>();
    //     int si = 0;
    //     int ei;
    
    //     for (ei = 0; ei < s.length(); ei++) {
    //         if (tab.containsKey(s.charAt(ei))) {
    //             si = Math.max(tab.get(s.charAt(ei)) + 1, si); // Update start index correctly
    //         }
    //         tab.put(s.charAt(ei), ei); // Update the current index of the character
    //         res = Math.max(res, ei - si + 1); // Update the result with the max length
    //     }
    
    //     return res;
    // }
    

    public static int lengthOfLongestSubstring(String s) {
        int res=0;
        Hashtable<Character,Integer> tab=new Hashtable<>();
        int si=0;
        int ei;

        for (ei = 0; ei < s.length(); ei++) {
            if(tab.containsKey(s.charAt(ei))){
                si=Math.max(tab.get(s.charAt(ei))+1, si);
            }
            tab.put(s.charAt(ei), ei);
            res=Math.max(res, ei-si+1);
        }

        return res;

    }

    public static void main(String[] args) {
        
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
