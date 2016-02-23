package combinationSum;
import java.util.*;

public class Solution {
    public List<List<Integer>> combinationSum2(int[] num, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(num.length == 0 || num == null)
            return res;
        Arrays.sort(num);
        helper(num, target, 0, new ArrayList<Integer>(), res);
        return res;
    }
    
    public void helper(int[] num, int target, int start, List<Integer> item, List<List<Integer>> res) {
        
        if(target == 0) {
            res.add(new ArrayList<Integer>(item));
            return;
        }
        
        if(target < 0 || start >= num.length)
            return;
            
        for(int i = start; i<num.length; i++) {
            if(i>start && num[i] == num[i-1]) continue;
            item.add(num[i]);
            helper(num,target-num[i], i+1,item, res);
            item.remove(item.size()-1);
        }
    }
    
    public static void main(String[] args) {
    	int[] test = new int[9];
    	for(int i = 0; i<9;i++) {
    		test[i] = i+1;
    	}
    	//test是0-9的数组
    	Solution sol = new Solution();  
    	for(List<Integer> list : sol.combinationSum2(test, 10)) {
    		for(int i:list) {
    			System.out.print(i+ " ");
    		}
    		System.out.println("");
    	}
    }
}