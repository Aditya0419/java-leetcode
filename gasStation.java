public class gasStation {
    public static int canCompleteCircuitTrial_wrongans(int[] gas, int[] cost) {
        int totGas=0;
        int totCost=0;
        int start=0;
        int currtank=0;
        
        if(cost.length==1 && gas[0]>=cost[0]) return 0; 

        for (int i = 0; i < cost.length; i++) {
            totGas+=gas[i];
            totCost+=cost[i];
        }

        if(totCost>totGas) return -1;

        for (int i = 0; i < cost.length; i++) {
            if(gas[i]-cost[i]<=0){
                continue;
            }
            else{
                start=i;
                break;
            }
        }

        int p=start;
        for (int i = 0; i < cost.length; i++) {
            currtank+=gas[p]-cost[p];
            System.out.println(currtank+" --- "+gas[p]+" index-"+p);
            if(currtank>=0){
                if(p==cost.length-1){
                    p=0;
                }else{
                    p++;
                }
                System.out.println(p);
            }else{
                return -1;
                
            }
        }



        return start;
    }


    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int total_surplus = 0;
        int surplus = 0;
        int start = 0;
        
        for(int i = 0; i < n; i++){
            total_surplus += gas[i] - cost[i];
            surplus += gas[i] - cost[i];
            if(surplus < 0){
                surplus = 0;
                start = i + 1;
            }
        }
        return (total_surplus < 0) ? -1 : start;
      
    }
    public static void main(String[] args) {
        int [] gas={5,1,2,3,4};
        int [] cost={4,4,1,5,1};

        System.out.println(canCompleteCircuit(gas, cost));
    }
}
