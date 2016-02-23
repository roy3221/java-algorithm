package rearrangeFourInteger;

import java.util.Arrays;

public class solution {

	public int[] rearrange(int A, int B, int C, int D) {
		int[] rvalue = new int[4];
		rvalue[0] = A;
		rvalue[1] = B;
		rvalue[2] = C;
		rvalue[3] = D;
		Arrays.sort(rvalue);
		swap(rvalue, 0, 1);
		swap(rvalue, 2, 3);
		swap(rvalue, 0, 3);
		return rvalue;
	}
	private void swap(int[] array, int i, int j) {
		int tmp=array[i];
		array[i]=array[j];
		array[j]=tmp;
	}
	public static void main(String args[]){
		int [] a={4,3,2,1};
		solution test= new solution();
		for(int i=0;i<a.length;i++){
			System.out.println(test.rearrange(4, 3, 2, 1)[i]);
		}
	}

}
