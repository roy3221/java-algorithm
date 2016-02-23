package triangle;

import java.util.ArrayList;
import java.util.List;

public class solution {
	public int minimumTotal(List<List<Integer>> triangle) {
        int[] dp = new int[triangle.size()];
        dp[0]=triangle.get(0).get(0);
        if(triangle.size()>=2){
            dp[1]=triangle.get(1).get(1)+dp[0];
            dp[0]+=triangle.get(1).get(0);
        }
        for (int i=2;i<triangle.size();i++) {
            int left = dp[0];
            int right = dp[1];
            dp[0] += triangle.get(i).get(0);
            for (int j = 1; j <= i - 1; j++) {
                dp[j] = triangle.get(i).get(j) + Math.min(left, right);
                left = right;
                right = dp[j + 1];
            }
            dp[i] = left + triangle.get(i).get(i);
            left = dp[0];
            right = dp[1];
        }
        for (int i = 0; i < dp.length - 1; i++)
            if (dp[i] < dp[i + 1])
                dp[i + 1] = dp[i];
        return dp[dp.length - 1];
	}
	public static void main(String args[]){
		List<List<Integer>> triangle= new ArrayList<List<Integer>>();
		int x=3;
		int y=x;
		System.out.println(y);
		x=8;
		System.out.println(y);
		
		
	}

}
