package reverseInteger;

public class Solution {
	
	public int reverse(int x) {
        if (x == 0) return 0;
        String reverse = "";
        if(x < 0) {
        	if(x == Integer.MIN_VALUE) x = x-1;
            x = Math.abs(x);
            System.out.println(x);
            reverse += "-";
        }
        while(x > 0) {
            reverse += x%10;
            x /= 10;
        }
        long res = Long.parseLong(reverse);
        return res < Integer.MAX_VALUE && res > Integer.MIN_VALUE ? (int)res : 0;
    }

	public static void main(String args[]) {
		Solution test = new Solution();
		System.out.println(test.reverse(-2147483648));
	}
}
