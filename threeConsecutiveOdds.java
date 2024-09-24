public class threeConsecutiveOdds {
    public static boolean threeConsecutiveOdds(int[] arr) {
        int i=0;
        int j=0;
        while(i<arr.length){
            if(arr[i]%2==1){
                System.out.println(arr[i]);
                j=i;
                while(j<arr.length && j<i+3){
                    System.out.print(arr[j]+" ");
                    if(arr[j]%2==1){
                        if(j==i+2) return true;
                        j++;
                    }
                    else{
                        break;
                    }  
                }
            }
            i++;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,34,3,4,5,7,23,12};
        System.out.println(threeConsecutiveOdds(arr));
    }
}
