import java.util.Arrays;


public class LOSET {
		public int threeSumClosest(int[] nums, int target) {
	        Arrays.sort(nums);
	        int min=Integer.MAX_VALUE, distance=Integer.MAX_VALUE, sum=Integer.MAX_VALUE, newdistance=Integer.MAX_VALUE;
	        if(nums.length<3) return 0;
	        if(nums.length==3) return nums[0]+nums[1]+nums[2];
	        for(int i=0;i<nums.length-1;i++){	        	
	            int start=i+1;
	            int end=nums.length-1;
	            sum=nums[i]+nums[start]+nums[end];
		        newdistance=Math.abs(sum-target);
		        if(newdistance<distance&&start<end){
	            	  min=sum;
		              distance=newdistance;
	              }
          	   // min=sum;
	            System.out.println("!!!outer loop i="+i+", START="+start+", end="+end);
	            System.out.println(" newdistance="+newdistance);
                System.out.println(" distance="+distance);
	        	System.out.println(" min="+min);
	        	 System.out.println("  sum="+sum);	
	        	 while(start<end){
	                   sum=nums[i]+nums[start]+nums[end];
	        		 newdistance=Math.abs(sum-target);
	                   System.out.println(" newdistance="+newdistance);
	                   System.out.println(" distance="+distance);
		              if(newdistance<distance){
		            	  min=sum;
			              distance=newdistance;
		              }
		              System.out.println(" min="+min);
	        			System.out.println("****Middle LOOP i="+i+", START="+start+", end="+end);
	        		 for(int j=end;j>start;j--){
			               end--;
		                   sum=nums[i]+nums[start]+nums[end];
		   	        	System.out.println("****LOOP i="+i+", START="+start+", end="+end);
		                   System.out.println("  sum="+sum);
		                   newdistance=Math.abs(sum-target);
		                   System.out.println(" newdistance="+newdistance);
		                   System.out.println(" distance="+distance);
			              if(newdistance<distance){
			            	  min=sum;
				              distance=newdistance;
			              }
			              System.out.println(" min="+min);
		               
		            }
	        		 end=nums.length-1;
	        		 ++start;

	        	 }
	        }
	        return min;
	    }
		public static void main(String args[]){
			int [] num={0,2,1,-3};
			LOSET test = new LOSET();
			System.out.println("Finally min="+test.threeSumClosest(num, 1));
			
		}
	}
