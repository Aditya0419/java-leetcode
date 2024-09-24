import java.util.HashMap;

public class wordPattern {
    public boolean wordPattern(String pattern, String s) {
        if (!(s.length() == pattern.length()))
            return false;
        HashMap<Character, String> hm = new HashMap<>();
        String[] str = s.split(" ");

        for (int i = 0; i < str.length; i++) {
            if (hm.containsKey(pattern.charAt(i)) || hm.containsValue(str[i])) {
                if (!hm.get(pattern.charAt(i)).equals(str[i]))
                    return false;
            } else {
                hm.put(pattern.charAt(i), str[i]);
            }
        }

        return true;
    }
}
