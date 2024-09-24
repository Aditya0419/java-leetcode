import java.util.Arrays;
import java.util.Stack;

public class dailyTemperature {
    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st=new Stack<>();
        int[] res=new int[temperatures.length];
        st.push(0);
        for (int i = 1; i < temperatures.length; i++) {
            System.out.println(st+" "+Arrays.toString(res));
            if(st.isEmpty() || temperatures[st.peek()]>temperatures[i]) st.push(i);
            else{
                while(!st.isEmpty() && temperatures[st.peek()]<temperatures[i]){
                    res[st.peek()]=i-st.pop();
                }
                st.push(i);
            }
        }
        System.out.println(Arrays.toString(res));
        return res;

        //TLE
        // int[] res=new int[temperatures.length];
        // res[temperatures.length-1]=0;
        // for (int i = res.length-2; i >=0; i--) {
        //     for (int j = i+1; j < res.length; j++) {
        //         if(temperatures[j]>temperatures[i]){
        //             res[i]=j-i;
        //             break;
        //         }
        //     }
        // }
        // System.out.println(Arrays.toString(res));
        // return res;
    }
    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        System.out.println(dailyTemperatures(temperatures));
    }
}
