public class lengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int cl=0;
        s=s.trim();
        for (int i = s.length()-1; i >=0; i--) {
            System.out.println("x"+s+"-");
            if(s.charAt(i)==' '){
                break;
            }else{
                cl++;
            }
        }
        
        return cl;
    }
    public static void main(String[] args) {
        lengthOfLastWord l = new lengthOfLastWord();
        System.out.println(l.lengthOfLastWord("   fly me   to   the moon  "));
    }
}
