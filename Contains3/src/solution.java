import java.util.HashMap;
import java.util.Map;


public class solution {
	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if((map.get(nums[i])-i)<=t||(map.get(nums[i])-i)>=k){
                    return true;
                }else  map.put(nums[i],i);
            }else   map.put(nums[i],i);
        }
        return false;
    }
	public static void main(String args[]){
		int [] nums={-1,-1};
		int t=1;
		int k=-1;
		System.out.println(new solution().containsNearbyAlmostDuplicate(nums, k, t));
	}
}
