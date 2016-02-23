
public class solution {
	 /* Method #1 binary search O(logn)
    public int mySqrt(int x) {
        if(x==0)
        return 0;
        long left=1;
        long right=x/2+1;// define the low and high bound of the result.
        while(left<=right){
            long res=(left+right)/2;
            if(res*res==x){
                return (int)res;
            }else if(res*res<x){
                left=res+1;
            }else{
                right=res-1;
            }
        }
        return (int)right;
    }*/
    // Method #2 Newton's method
        public int mySqrt(int x) {
            long r = x;
            while (r*r > x)
            r = (r + x/r) / 2;
            return (int) r;
        }
	
}
