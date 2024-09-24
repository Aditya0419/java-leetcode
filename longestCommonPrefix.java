import java.util.Arrays;

public class longestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        String res="";
        int point=0;
        if(strs.length==0) return "";
        else if(strs.length==1) return strs[0];
        Arrays.sort(strs);
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if(strs[0].charAt(point)!=strs[j].charAt(point)){
                    return res;
                    
                }else if(j==strs.length-1 && strs[0].charAt(point)==strs[j].charAt(point)){
                    res+=strs[0].charAt(point);
                }
            }
            point++;
        }

        return res;
    }

    public static void main(String[] args) {
        String[] strs={"reflower","flow","flight"};

        System.out.println(longestCommonPrefix(strs));
    }
}
