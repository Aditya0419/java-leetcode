import java.util.HashMap;

public class validAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character,Integer> hm=new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            hm.put(s.charAt(i), hm.containsKey(s.charAt(i))?hm.get(s.charAt(i))+1:1);
        }
        for (int i = 0; i < t.length(); i++) {
            if(hm.containsKey(t.charAt(i)) && hm.get(t.charAt(i))>0) hm.put(t.charAt(i), hm.get(t.charAt(i))-1);
            else return false;
        }

        return true;
    }
}
