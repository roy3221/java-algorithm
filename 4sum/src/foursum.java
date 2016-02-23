import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class foursum {
	public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> results= new ArrayList<List<Integer>>();
        List<Integer> result=new ArrayList<Integer>();
        int sum= Integer.MAX_VALUE;
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-3;i++){
    		System.out.println("11111111111111");
            for(int j=i+1;j<n-2;j++){
            	 int k=j+1;
                 int l=n-1;
                 sum=nums[i]+nums[j]+nums[k]+nums[l];
        		System.out.println("22222222222222");              
                while(nums[j]==nums[j++]&&j<n-2){
                    j++;
            		System.out.println("j="+j);              
                }
                while(k<l){
            		System.out.println("333333333333333");

                    if(sum<target){
                        do{
                    		System.out.println("5555555555555");              
                            k++;
                        }while(k<l&&nums[k]==nums[k--]);
                    }    
                    if(sum>target){
                        do{
                    		System.out.println("6666666666666666");              
                            j--;
                        }while(k<l&&nums[l]==nums[l--]);
                    }else{
                		System.out.println("44444444444444");
                        result.add(nums[i]);
                        result.add(nums[j]);
                        result.add(nums[k]);
                        result.add(nums[j]);
                        results.add(result);
                        do{
                            k++;
                        }while(k<l&&nums[k]==nums[k--]);
                        do{
                            j--;
                        }while(k<l&&nums[j]==nums[j--]);
                    }
                }
            }
        }
       return results; 
    }
	public static void main(String args[]){
		int num[]={2,1,0,-1};
		foursum test=new foursum();
		System.out.println(test.fourSum(num, 2));
	}
}
