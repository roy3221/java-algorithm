package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset2 {
	public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        getSubsets(nums, res, 0, new ArrayList<>());
        return res;
    }
    
    private void getSubsets(int[] nums, List<List<Integer>> res, int index, List<Integer> subset) {
        res.add(new ArrayList<Integer>(subset));
        for(int i = index; i < nums.length; i++) {
            if(i>index&&nums[i]==nums[i-1]) continue;
            subset.add(nums[i]);
            getSubsets(nums, res, i+1, subset);
            subset.remove(subset.size()-1);
        }
    }

}
