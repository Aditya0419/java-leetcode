import java.util.Arrays;

public class reverseString {
    public static String reverseWords(String s) {
        s=s.trim();
        String res="";
        String[] words = s.split("\\s+");
        System.out.println(Arrays.toString(words));
        for (int i = words.length-1; i >0; i--) {
            res=res+words[i]+" ";
        }
        res=res+words[0];
        return res;
    }
    public static void main(String[] args) {
        System.out.println(reverseWords("    hello    this   is   a string"));
    }
}
