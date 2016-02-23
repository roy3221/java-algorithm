package getLAS;
/*
 * Find arithmetic sequence in an array.
 */
public class solution {
	public static int getLAS(int[] A){
		if(A.length<3) return 0;
		int res=0;
		int diff=Integer.MIN_VALUE;
		int count=0;
		int start=0;
		for(int i=1; i<A.length;i++){
			int curDiff=A[i]-A[i-1];
			if(diff==curDiff){
				count+= i-start-1>0? i-start-1:0;
			}else{
				start=i-1;
				diff=curDiff;
				res+=count;
				count=0;
			}
		}
		res+=count;
		return res;
	}
	public static void main(String args[]){
		int[] A={-1,1,3,3,3,2,1,0};
		System.out.println(solution.getLAS(A));
	}

}
