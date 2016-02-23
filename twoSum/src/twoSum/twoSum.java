package twoSum;

import java.util.HashMap;
import java.util.Map;
public class twoSum {
	   Map<Integer, Integer> map = new HashMap<>();
	public int[] twoSums(int[] nums, int target) {
        int[] twoSum = new int[2];

     //keep a map of value -> index pairs.

 
    for (int i = 0; i < nums.length; i++) {
        if (map.containsKey(target - nums[i])) { 

            //check if the other num is in the map, if yes, we a done.

            twoSum[0] = map.get(target - nums[i]);
            twoSum[1] = i + 1;
            return twoSum;
        } else {

            //if not, add to the map.

            map.put(nums[i], i + 1);
        }
    }
   
    return twoSum;
    }
	public static void main(String args[]){
		int [] num={2,3,4,5,6};
		twoSum test= new twoSum();
		int[] result=test.twoSums(num,10);
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
		 for(int i=0;i<test.map.size();i++){
	    	 System.out.println(test.map.get(i));
	    }
	}
}
