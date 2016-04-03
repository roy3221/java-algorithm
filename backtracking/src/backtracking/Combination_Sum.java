package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum {
	
List<List<Integer>> res;
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        res = new ArrayList<>();
        getSum(candidates, target, 0, new ArrayList<Integer>());
        return res;
    }
    
    private void getSum(int[] candidates, int target, int start, List<Integer> set) {
        if(target == 0) {
            res.add(new ArrayList<Integer>(set));
            return;
        }else if(target > 0){
            for(int i = start; i < candidates.length; i++) {
                set.add(candidates[i]);
                getSum(candidates, target - candidates[i], i, set);
                set.remove(set.size()-1);
            }
        }        
    }

}
