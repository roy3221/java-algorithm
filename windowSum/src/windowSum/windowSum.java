package windowSum;

public class windowSum {
	public int[] Solution(int[] array, int k) {
		if (array == null || array.length < k || k <= 0)	return null;
		int[] rvalue = new int[array.length - k + 1];
		for (int i = 0; i < k; i++){
			rvalue[0] += array[i];
		}
		for (int i = 1; i < rvalue.length; i++) {
			rvalue[i] = rvalue[i-1] - array[i-1] + array[i+k-1];
			//rolling the k elements to add up.
		}
		return rvalue;
	}
	public static void main(String args[]){
		int [] a ={4,2,73,11,-5};
		int size=2;
		windowSum test=new windowSum();
		for(int i=0; i<a.length-size+1;i++){
			System.out.println(test.Solution(a, size)[i]);
		}
	}

}
