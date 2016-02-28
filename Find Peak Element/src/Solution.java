
public class Solution {
	    public int findPeakElement(int[] nums) {
	        int start = 0;
	        int end = nums.length-1;
	        while( start < end){
	            if(start +1== end)
	                return nums[start] > nums[end]? start : end;
	            int mid = start + (end-start)/2;
	            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1])
	            return mid;
	            else if(nums[mid] > nums[mid-1] && nums[mid] < nums[mid+1]){
	                start = mid+1;
	            }else 
	                end = mid-1;
	        }
	        return start;
	    }
	    
	    
	    
	    //RECURSIVE
//	     public int findPeakElement(int[] num) {    
//	     return helper(num,0,num.length-1);
	// }

	// public int helper(int[] num,int start,int end){
//	     if(start == end){
//	         return start;
//	     }else if(start+1 == end){
//	         if(num[start] > num[end]) return start;
//	         return end;
//	     }else{

//	         int m = (start+end)/2;

//	         if(num[m] > num[m-1] && num[m] > num[m+1]){

//	             return m;

//	         }else if(num[m-1] > num[m] && num[m] > num[m+1]){

//	             return helper(num,start,m-1);

//	         }else{

//	             return helper(num,m+1,end);

//	         }

//	     }
	// }

}
