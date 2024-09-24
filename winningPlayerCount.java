import java.util.ArrayList;
import java.util.HashMap;

public class winningPlayerCount{
    public int winningPlayerCount(int n, int[][] pick) {
        HashMap<Integer,HashMap<Integer,Integer>> hm=new HashMap<>();
        int count=0;
        ArrayList<Integer> visited=new ArrayList<>();
        for (int i = 0; i < pick.length; i++) {
            if(hm.containsKey(pick[i][0])){
                if(hm.get(pick[i][0]).containsKey(pick[i][1])){
                    hm.get(pick[i][0]).put(pick[i][1],hm.get(pick[i][0]).get(pick[i][1])+1);
                }else{
                    hm.get(pick[i][0]).put(pick[i][1],1);
                }

                if(hm.get(pick[i][0]).containsValue(pick[i][0]+1)){
                    System.out.println(pick[i][0]);
                    if(!visited.contains(pick[i][0])){
                        visited.add(pick[i][0]);
                        count++;
                    }
                }
            }else{
                HashMap<Integer,Integer> hm1=new HashMap<>();
                hm1.put(pick[i][1],1);
                hm.put(pick[i][0], hm1);
                if(hm.get(pick[i][0]).containsValue(pick[i][0]+1)){
                    System.out.println(pick[i][0]);
                    if(!visited.contains(pick[i][0])){
                        visited.add(pick[i][0]);
                        count++;
                    }
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {
        winningPlayerCount wp = new winningPlayerCount();
        int n = 5;
        int[][] pick = {{1,1},{2,4},{2,4},{2,4}};
        System.out.println(wp.winningPlayerCount(n, pick));
    }
}