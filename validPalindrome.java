public class validPalindrome {
    public static boolean isPalindrome(String s) {
        Boolean res=true;
        
        String m="";
        s=s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if((s.charAt(i)<='z' && s.charAt(i)>='a')||(s.charAt(i)<=57 && s.charAt(i)>=48) ){
                m+=s.charAt(i);
            }else continue;
        }
        int st=0,ed=m.length()-1;
        System.out.println(m);

        System.out.println((int)'8');
        for (int i = 0; i < m.length()/2; i++) {
            if(m.charAt(st)==m.charAt(ed)){
                System.out.println(m.charAt(st)+" "+m.charAt(ed));
                st++;
                ed--;
            }else{
                return false;
            }
        }

        return res;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }
}
