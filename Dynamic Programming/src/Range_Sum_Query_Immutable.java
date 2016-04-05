
public class Range_Sum_Query_Immutable {
	public class NumArray {
	    int[] SumFromZero;
	    
	    public NumArray(int[] nums) {
	        SumFromZero = new int[nums.length];
	        if(nums.length == 0) return;
	        SumFromZero[0] = nums[0];
	        if(nums.length == 1) return;
	        for(int i = 1; i < nums.length; i++) {
	           SumFromZero[i] = SumFromZero[i-1] + nums[i]; 
	        }
	    }

	    public int sumRange(int i, int j) {
	        if(i == 0) return SumFromZero[j];
	        else
	            return SumFromZero[j] - SumFromZero[i-1];
	    }
	}


	// Your NumArray object will be instantiated and called as such:
	// NumArray numArray = new NumArray(nums);
	// numArray.sumRange(0, 1);
	// numArray.sumRange(1, 2);
}
