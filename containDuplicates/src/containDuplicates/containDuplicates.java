package containDuplicates;

public class containDuplicates {
	public boolean containsDuplicate(int[] nums) {
        if (nums.length<2) return false;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if (nums[i]==nums[j]) return true;
            }
        }
        return false;
    }
	public static void main(String args[]){
		
	}

}
