class Solution {
    
    int totalSum(int[] a){
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
        }
        return sum;
    }
    
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = totalSum(gas);
        int totalCost = totalSum(cost);
        
        if(totalGas<totalCost){
            return -1;
        }
        int start = 0;
        int tank = 0;
        int total = 0;
        int diff = 0;
        
        for(int i = 0; i < gas.length; i++){
            diff = gas[i] - cost[i];
            total += diff;
            tank += diff;
            if(tank < 0){
                start = i + 1;
                tank = 0;
            }
        }
        if(total<0){
            return -1;
        }
        else{
            return start;
        }
    }
}