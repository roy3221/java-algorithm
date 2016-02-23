package combinationSum2;

public class Solution {
	int sum=0;
	
	public int dp(int k, int i, int n){
		if(i>n) {
			System.out.println("i>n");			
			return 0;
		}
		if(k==1) {
			System.out.println("k=1");
			return 1;
		}
		for(int j=i;j<n;j++){
			int x=k-1;
			int y=j+1;
			int z=n-j;
			sum+=dp(k-1,j+1,n-j);
			System.out.println("dp("+x+","+y+","+z+")");
			System.out.println(sum);
		}
		return sum;
	}
	public static void main(String args[]){
		Solution test= new Solution();
	System.out.println(test.dp(2,1,10));
	}

}
