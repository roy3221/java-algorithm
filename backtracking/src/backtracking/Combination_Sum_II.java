package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum_II {
	
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        getSum(candidates, target, 0, new ArrayList<Integer>(), res);
        return res;   
    }

    private void getSum(int[] candidates, int target, int start, List<Integer> set, List<List<Integer>> res) {
        if(target == 0) {
            res.add(new ArrayList<Integer>(set));
            return;
        } else if(target > 0) {
            for(int i = start; i < candidates.length; i++) {
                // System.out.println("start= "+start);
                if( i>start && candidates[i] == candidates[i-1])    continue; //emilate the duplicate.
                set.add(candidates[i]);// each out call (loop) will add the candidate number, only in the inner loop need to emilate the duplicate.
                // System.out.println(set);
                getSum(candidates, target - candidates[i], i+1, set, res);
                set.remove(set.size()-1);
            }
        }
    }
}
