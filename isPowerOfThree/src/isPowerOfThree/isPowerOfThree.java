package isPowerOfThree;

public class isPowerOfThree {

	public boolean IsPowerOfThree(int n) {
		System.out.println(Integer.toString(n, 3));
	    return Integer.toString(n, 3).matches("10*");
	}
	public static void main(String args[]){
		isPowerOfThree test= new isPowerOfThree();
		System.out.println(test.IsPowerOfThree(22));
	}
}
