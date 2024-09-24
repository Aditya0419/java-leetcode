import java.util.ArrayList;

public class firstOccurence {
    public static int strStr(String haystack, String needle) {
        int nP=0;
        int hP=0;
        int start=-1;
        ArrayList<Integer> occur=new ArrayList<>();
        if(haystack.length()==0 || needle.length()==0 || haystack.length() < needle.length()) return -1;
        for (int i = 0; i < haystack.length(); i++) {
            if(haystack.charAt(i)==needle.charAt(0)){
                occur.add(i);
            }
        }
        for (int i = 0; i < occur.size(); i++) {
            if(occur.get(i)<=haystack.length()-needle.length()){
                hP=occur.get(i);
                start=occur.get(i);
                for (int j = 0; j < needle.length(); j++) {
                    if(haystack.charAt(hP)==needle.charAt(nP)){
                        hP++;
                        nP++;
                    }else{
                        nP=0;
                        start=-1;
                        break;
                    }
                }
                if(nP==needle.length()){
                    return start;
                }
            }
        }
        return start;
    }



    // ----------------------------EASY APPROACH------------------------------------------------------------------------
    // public int strStr(String haystack, String needle) {
    //     int i=haystack.indexOf(needle);
    //     return i;
        
    // }
    //--------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        System.out.println(strStr("mississipi", "issip"));
    }
}
