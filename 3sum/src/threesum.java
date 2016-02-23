import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class threesum {
	  int zero=0;
	    ArrayList<List<Integer>> result =new ArrayList<List<Integer>>();
	    public List<List<Integer>> threeSum(int[] nums) {
	        Arrays.sort(nums);
	        for(int i=0; i<nums.length;i++){
	            if(nums[i]>0||nums[i]==0)
	            zero=i;break;
	        }//find the zero index;
	            for(int i=0;i<zero;i++){
	                for(int j=zero;j<nums.length;j++){
	                    for(int k=zero+1;k<nums.length;k++){
	                        if(nums[i]+nums[j]+nums[k]==0)
	                        AddtoList(nums[i],nums[j],nums[k]);
	                    }
	                }
	            }//two numbers that >=0 plus one number <0 =0
	            for(int j=zero;j<nums.length;j++){
	                for(int i=zero-1;i>0;i--){
	                    for(int k=zero-2;k>0;k--){
	                        if(nums[i]+nums[j]+nums[k]==0)
	                        AddtoList(nums[k],nums[i],nums[j]);
	                    }
	                }
	            }// two numbers that <0 plus one number that >=0 =0;
	            return result;
	        }
	        private void AddtoList(int a, int b, int c){
	        	ArrayList<Integer> pass= new ArrayList<Integer>();
	        	pass.add(a);
	        	pass.add(b);
	        	pass.add(c);
	            result.add(pass);
	        }
        public static void main(String args[]){
        	threesum test =new threesum();
        	int[] num={-1,0,1,2,3,4,-3};
        	System.out.println(test.threeSum(num));
        	
        }
}
