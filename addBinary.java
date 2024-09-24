public class addBinary {
    public int bintodec(String a) {
        int sum = 0;
        for (int i = 0; i < a.length(); i++) {
            sum += (a.charAt(i) - '0') * Math.pow(2, a.length() - 1 - i);
        }
        System.out.println(sum);
        return sum;
    }

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

    public String addBinary(String a, String b) {
        int carry=0;
        int i=a.length()-1;
        int j=b.length()-1;
        StringBuilder s=new StringBuilder();
        while(i>=0 || j>=0 || carry!=0){
            if(i>=0) carry+=a.charAt(i--)-'0';
            if(j>=0) carry+=b.charAt(j--)-'0';
            s.append(carry % 2);
            carry /= 2;
        }

        return s.reverse().toString();
    }

    public static void main(String[] args) {
        addBinary a = new addBinary();
        System.out.println(a.addBinary("11", "1"));
    }
}
