public class NumberofBitChangeTomakeTwoNumEqual{
    public String dectobin(int a) {
        StringBuilder s = new StringBuilder();
        while (a > 0) {
            s.append(a % 2);
            a /= 2;
        }
        System.out.println(s);
        if (s.isEmpty())
            return "0";
        return s.reverse().toString();
    }
    public int minChanges(int n, int k) {
        StringBuilder s = new StringBuilder();
        StringBuilder t = new StringBuilder();
        while (n > 0) {
            s.append(n % 2);
            n /= 2;
            t.append(k % 2);
            k /= 2;
        }
        
        if(t.length()>s.length()) return -1;
        else if(s.length()>t.length()){
            while(t.length()!=s.length()) t.append(0);
        }
        int count = 0;
        System.out.println(s);
        System.out.println(t);
        for(int i=0;i<t.length();i++){
            System.out.println(s.charAt(i)+" "+t.charAt(i));
            if(s.charAt(i)==t.charAt(i)) continue;
            else if(s.charAt(i)!=t.charAt(i) && s.charAt(i)=='1'){count+=1;System.out.println("hi");}
            else if(s.charAt(i)!=t.charAt(i) && s.charAt(i)=='0') return -1;
            System.out.println(count);
        } 

        return count;
    }
    public static void main(String[] args) {
        NumberofBitChangeTomakeTwoNumEqual obj = new NumberofBitChangeTomakeTwoNumEqual();
        System.out.println(obj.minChanges(13, 4));
    }
}