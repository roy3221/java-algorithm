package moveZero;

public class moveZero {
	public void moveZeroes(int[] nums) {
		 int k=0;
	       if(nums.length>1){
	           int start=0;
	            for(int i=start;i<nums.length-1;i++){
	                k++;
	                if(nums[i]==0){
	                    System.arraycopy(nums,i+1,nums,i,nums.length-i-1);
	                    nums[nums.length-1]=0;
	                    i=i-1;
	                }
	                if (k==nums.length) break;
	            }
	        }
	    }
	public static void main(String args[]){
		int num[]= new int[]{0,1,0,2,3,4,0,0,0,33,1,23,4,0,8,1,0};
		moveZero test = new moveZero();
		test.moveZeroes(num);
		for(int i=0;i<num.length;i++){
			System.out.println(num[i]);

		}
	}
	
}
