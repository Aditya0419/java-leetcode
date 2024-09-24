import java.util.Hashtable;

public class minimumWindowSubtring {
    public static String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length())
            return "";
        else if (s.equals(t))
            return s;
        int si = 0;
        int ei = 0;
        int min = Integer.MAX_VALUE;
        String minStr = "";
        Hashtable<Character, Integer> ht = new Hashtable<>();
        int count=t.length();
        for (int i = 0; i < t.length(); i++) {
            if (ht.containsKey(t.charAt(i)))
                ht.put(t.charAt(i), ht.get(t.charAt(i)) + 1);
            else
                ht.put(t.charAt(i), 1);
        }
        while (ei < s.length()) {
            if (ht.containsKey(s.charAt(ei)) && ht.get(s.charAt(ei)) != 0) {

                System.out.println(s.charAt(ei)+" "+ht);
                ht.put(s.charAt(ei), ht.get(s.charAt(ei)) - 1);
                if (ht.get(s.charAt(ei)) >= 0) {
                    count--;
                }

                if (count==0) {
                    System.out.println(s.charAt(ei) + " " + si + " " + ei);
                    while (si <= ei) {
                        System.out.println("hiiiiiiiiiiiiiiiii");
                        if (!ht.containsKey(s.charAt(si))) {
                            si++;
                            System.out.println(si + " ssssssssssssssss");
                        } else if (ht.containsKey(s.charAt(si)) ) {
                            while (si < ei && (si<s.substring(si, ei).lastIndexOf(s.charAt(si)) || s.charAt(si) == s.charAt(si + 1) && ei-si>=t.length())) {
                                System.out.println("elseeee whileee "+si);
                                si++;
                            }
                            break;
                        }
                    }
                    if (ei - si < min) {
                        min = ei - si;
                        minStr = s.substring(si, ei + 1);
                    }
                    ht.clear();
                    for (int i = 0; i < t.length(); i++) {
                        if (ht.containsKey(t.charAt(i)))
                            ht.put(t.charAt(i), ht.get(t.charAt(i)) + 1);
                        else
                            ht.put(t.charAt(i), 1);
                        count++;
                    }
                    ei = si+1 ;
                    si = ei;
                    continue;
                }
            }
            // System.out.println(s.charAt(ei));
            System.out.println(minStr+" ans");
            ei++;

        }
        return minStr;
    }

    public static void main(String[] args) {
        System.out.println(minWindow("aaabbaaba", "abbb"));
    }
}
