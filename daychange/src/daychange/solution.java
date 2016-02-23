package daychange;

import java.util.Arrays;

public class solution {
	public int[] Solution(int[] days, int n) {
		if (days == null || n <= 0)	return days;
		int length = days.length;
		int[] rvalue = new int[length + 2];
		rvalue[0] = rvalue[length+1] = 0;
		int pre = rvalue[0];
		for (int i = 1; i <= length; i++)
			rvalue[i] = days[i-1];
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= length; j++) {
				int temp = rvalue[j];
				if(pre==rvalue[j+1]){
					rvalue[j] = 1;
				}
				else {
					rvalue[j] =0;
				}
				pre = temp;
			}
		}
		return Arrays.copyOfRange(rvalue, 1, length+1);
	}

}
