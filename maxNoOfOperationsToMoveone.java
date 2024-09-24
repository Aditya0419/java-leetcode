import java.util.Arrays;

public class maxNoOfOperationsToMoveone {
    //TLE excedeed
    // public int maxOperations(String s) {
    //     char[] ch=s.toCharArray();
    //     int count=0;
    //     for (int i = 0; i <ch.length-1; i++) {
    //         if(ch[i]=='1' && ch[i+1]=='0'){
    //             int x=i;
    //             while(x<ch.length-1 && ch[x+1]=='0'){                 
    //                 x++;
    //                 if(x==ch.length-1 || ch[x+1]=='1') break;
    //             }
    //             char y=ch[x];
    //             ch[x]=ch[i];
    //             ch[i]=y;
    //             count++;
    //         }
    //         if(i>0 && ch[i-1]=='1' && ch[i]=='0'){
    //             i-=2;
    //         }
    //     }
    //     System.out.println(Arrays.toString(ch));
    //     return count;
    // }
    public int maxOperations(String s) {
        int res=0,one=0,n=s.length();
        for (int i = 0; i < n; i++) {
            one+=s.charAt(i)-'0';
            if(i>0 && s.charAt(i)<s.charAt(i+1)){
                res+=one;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        maxNoOfOperationsToMoveone obj=new maxNoOfOperationsToMoveone();
        System.out.println(obj.maxOperations("1001101"));
    }
}
