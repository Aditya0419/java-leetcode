public class numberOfOneBits {
    public int hammingWeight(int n) {
        StringBuilder s = new StringBuilder();
        int count=0;
        while (n > 0) {
            s.append(n % 2);
            if(n%2==1) count++;
            n /= 2;
        }
        System.out.println(s);
        if (s.isEmpty())
            return 0;
        return count;
    }
}
