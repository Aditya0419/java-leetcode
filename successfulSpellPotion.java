import java.util.Arrays;

public class successfulSpellPotion {
    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] res=new int[spells.length];
        Arrays.sort(potions);
       
        for (int i = 0; i < spells.length; i++) {
            int n=spells[i];
            int l=0,r=potions.length; 
            while(l<r){
                int mid = l + (r - l) / 2;
                if(n*1l*potions[mid]<success){
                    l=mid+1;
                }else{
                    r=mid;
                }
            }
            res[i]=potions.length-r;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] spells = {3,1,2};
        int[] potions = {8,5,8};
        successfulPairs(spells,potions, 16);
    }
}
