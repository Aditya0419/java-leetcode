public class isPalindrome {
    public boolean isPalindrome(int x) {
        String num=Integer.toString(x);
        int si=0,ei=num.length()-1;
        while(si<=ei){
            if(num.charAt(si)!=num.charAt(ei)){
                return false;
            }
            si++;
            ei--;
        }

        return true;
    }
    public static void main(String[] args) {
        
    }
}
