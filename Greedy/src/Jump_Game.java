
public class Jump_Game {
	public boolean canJump(int[] nums) {
        int max = 0; 
        for(int i=0;i<nums.length && max < nums.length;i++){
            if(i>max) return false;
            max = Math.max(nums[i]+i,max);// max represent the max position that current position can reach.
        }
        return true;
    }

}
