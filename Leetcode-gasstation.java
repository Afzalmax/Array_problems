class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas=0;
        int totalcost=0;
        int currentgas=0;
        int startingpoint=0;
        for(int i=0;i<gas.length;i++){
            totalgas+=gas[i];
            totalcost+=cost[i];
            currentgas+=gas[i]-cost[i];
            if(currentgas<0){
                startingpoint=i+1;
                currentgas=0;
            }
        }
        if(totalgas<totalcost){
            return -1;
        }
        else{
            return startingpoint;
        }
    }
}