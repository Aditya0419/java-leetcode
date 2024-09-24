import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class RansomeNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hs=new HashMap<>();
        if(ransomNote.length()>magazine.length()) return false;
        for (int i = 0; i < magazine.length(); i++) {
            hs.put(magazine.charAt(i),hs.containsKey(magazine.charAt(i))?hs.get(magazine.charAt(i))+1:1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            System.out.println(i);
            if(hs.containsKey(ransomNote.charAt(i)) && hs.get(ransomNote.charAt(i))>0){
                System.out.println("if "+ransomNote.charAt(i));
                System.out.println(hs);
                hs.put(ransomNote.charAt(i), hs.get(ransomNote.charAt(i))-1);
                System.out.println(hs);
            }else{
                System.out.println(hs);
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("aab", "ccs"));
    }
}
