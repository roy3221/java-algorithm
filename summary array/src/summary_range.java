import java.util.ArrayList;
import java.util.List;


public class summary_range {
    List<String> result= new ArrayList<>();
	public List<String> summaryRanges(int[] nums) {
        if (nums == null || nums.length == 0) {
            return result;
        }
        
        int pre = nums[0];
        int range = 0;
        
        for (int i = 1; i <=nums.length; i++) {// why i <=nums.length? need an additional iteration to add the last result.
        	System.out.println("i="+i);
            if (i != nums.length && nums[i - 1] == nums[i] - 1) {
                range++;
            } else {
                if (range == 0) {
                    result.add(Integer.toString(pre));
                } else {
                    result.add(Integer.toString(pre) + "->" + Integer.toString(pre + range));
                }
               if (i != nums.length) {
                    pre = nums[i];
                    range = 0;
                }
            }
        	System.out.println("result="+result);
        	System.out.println("range="+range);
        }
        return result;
    }
	public static void main(String args[]){
		int nums[]={0,1,2,3,5,6};
		summary_range test = new summary_range();
		test.summaryRanges(nums);
		for(int i=0; i<test.result.size();i++){
			System.out.print(test.result.get(i)+"  ");
		}
		System.out.println();
	}
}
