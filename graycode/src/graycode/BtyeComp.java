package graycode;

public class BtyeComp {
	public static int grayCode(byte element1, byte element2) {
		byte res = (byte) (element1 ^ element2);// xor two input byte, if they are graycode, then res only has one bit which is 1.
		for (int i = 0; i <= 7; i++) {
		byte temp = (byte)(1 << i);//judge each bit, whether it is 1 or not.
		if (temp == res) {
		return 1;
		}
		}
		System.out.println("No");
		return 0;
		}
	
	public static void main(String args[]){
		int res=BtyeComp.grayCode((byte)-1,(byte)2);
		System.out.println(res);
	}
}


