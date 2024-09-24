public class factorialTrailingZeroes {
    public static int trailingZeroes(int n) {
        int cnt = 0;
        while(n > 0){
            n = n / 5;
            cnt  = cnt + n;
        }
        return cnt;
    }
    public static void main(String[] args) {
        System.out.println(trailingZeroes(13));
    }
}
