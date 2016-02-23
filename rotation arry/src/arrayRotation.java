
public class arrayRotation {
	 public void rotate(int[] nums, int k) {
	        int steps= k%nums.length;
	        System.out.println("steps="+steps);
	        int begin=nums.length-steps;
	        System.out.println("begin="+begin);
	        int initial=0;
	        int result []= new int [nums.length];
	        for(int i=0; i<steps;i++){
	            result[i]=nums[begin++];
	        }
	        for(int i=steps;i<nums.length;i++){
	            result[i]=nums[initial++];
	        }
	        System.arraycopy(result, 0, nums, 0, nums.length);
	    }
	 public static void main(String args[]){
		int [] nums={1,2};
		int k=1;
		new arrayRotation().rotate(nums, k);
		for(int i=0; i<2;i++){
			System.out.println(nums[i]);
		}
		 
	 }
}
