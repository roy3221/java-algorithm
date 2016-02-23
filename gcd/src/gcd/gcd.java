package gcd;

public class gcd {
	
	public int Solution(int[] array) {
		if (array == null || array.length == 1)	return 0;
		int gcd = array[0];
		for (int i = 1; i < array.length; i++) {
			gcd = gcd(gcd, array[i]);
		}
		return gcd;
	}
	private int gcd(int m, int n) {
		 if (m < n) {// 保证m>n,若m<n,则进行数据交换  
	            int temp = m;  
	            m = n;  
	            n = temp;  
	        }  
	        if (m % n == 0) {// 若余数为0,返回最大公约数  
	            return n;  
	        } else { // 否则,进行递归,把n赋给m,把余数赋给n  
	            return gcd(n, m % n);  
	        }  
	}

}
