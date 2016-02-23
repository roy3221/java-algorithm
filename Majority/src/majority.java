import java.util.Arrays;


public class majority {
	  int majority=0;
      int count=0;
      int mark=0;
	 public int majorityElement(int[] nums) {
	      
	        if(nums.length==1) 
	        majority=nums[0];
	        if(nums.length==2){
	            if(nums[0]==nums[1])
	            majority=nums[0];
	        }
	        Arrays.sort(nums);
	        for(int i=0;i<nums.length-1;i++){
	            if(nums[i]==nums[i+1]){
	                count++;
	                if(count>nums.length/2)
	                majority=nums[i];
	                mark=i;
	            }
	        }
	        return majority;
	    }
		public static void main(String args[]){
			int[] nums={3,3,4};
			majority test=new majority();
			System.out.println(test.majorityElement(nums));
			System.out.println(test.count);
			System.out.println(test.mark);
			
			
		}
}
