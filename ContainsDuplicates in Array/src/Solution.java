import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Solution {//思路： 用hash mark the indices and the value. sort the array. find two equal vaules and judge the difference of their indices.
	   	public boolean containsNearbyDuplicate(int[] nums, int k) {
	        Map<Integer, Integer> map = new HashMap<>();
	        for(int i=0; i<nums.length;i++){
	            map.put(nums[i], i);
	        }
	        Arrays.sort(nums);
	        for(int i=0;i<nums.length-1;i++){
	            System.out.println(nums[i]);
	            int dif=map.get(nums[i])-map.get(nums[i+1]);
	            if(nums[i]==nums[i+1]&&dif<=k&&dif>=0) {
	                System.out.println("dif="+ dif);
	                return true;
	            }
	        }
	        return false;
	    }
	   	public static void main(String args[]){
	   		int [] nums={1,2,1};
	   		int k=0;
	   		System.out.println(new Solution().containsNearbyDuplicate(nums, k));
	   	}
}
