
public class Gas_Station {
	// The solution is based on two observations:
    // 1. if the total gas > cost, there must a start index to finish the circle, else there isn't;
    // 2. as to an index i, if from i, j is the first index that we cannot reach, then any index from i to j, cannot be the start index. 
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total =0;
        for( int i = 0; i < gas.length; i++) {
            total += gas[i] - cost[i];
        }
        if(total < 0) return -1;
        
        int start = 0;
        int accumulate = 0;
        for(int i = 0; i < gas.length; i++) {
            if(accumulate + gas[i] - cost[i] < 0) {
                start = i+1;
                accumulate = 0;
            }else{
                accumulate += gas[i] - cost[i];
            }
        }
        return start;
    }
}
