public class isSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int pointS=0;
        boolean res=false;

        if(s.length()<1)
            return true;
        for (int i = 0; i < t.length(); i++) {
            if(t.charAt(i)==s.charAt(pointS)){
                pointS++;
            }else{
                continue;
            }

            if(pointS==s.length()){
                return true;
            }
        }

        return res;
    }
    public static void main(String[] args) {
        System.out.println(isSubsequence("axc","ahbgdc"));
    }
}
