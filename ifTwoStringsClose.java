import java.util.ArrayList;
import java.util.Arrays;

public class ifTwoStringsClose {
    public static boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()) return false;
        char[] w1=word1.toCharArray();
        char[] w2=word2.toCharArray();
        int[] c1=new int[26];
        int[] c2=new int[26];
        for (int i = 0; i < w2.length; i++) {
            c1[w1[i]-'a']++;
            c2[w2[i]-'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if ((c1[i] == 0 && c2[i] != 0) || (c1[i] != 0 && c2[i] == 0)) {
                return false;
            }
        }
        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println(Arrays.toString(c1));
        System.out.println(Arrays.toString(c2));
        for (int i = 0; i < 26; i++) {
            if(c1[i]!=c2[i]) return false;
            else if(c1[i]==c2[i] && i==25) return true;
        }

        return false;
    }
    public static void main(String[] args) {
        System.out.println(closeStrings("uau", "ssx")); // true
    }
}
