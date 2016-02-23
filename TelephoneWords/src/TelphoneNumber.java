import java.util.List;


public class TelphoneNumber {
private static final int PHONE_NUMBER_LENGTH=8;
private final int[] phoneNum;

private final char[] two= new char[3];
private final char[] three= new char[3];
private final char[] four= new char[3];
private final char[] five= new char[3];
private final char[] six= new char[3];
private final char[] seven= new char[3];
private final char[] eight= new char[3];
private final char[] nine= new char[3];

private char[] result= new char[PHONE_NUMBER_LENGTH];
@SuppressWarnings("unused")
private int count=0;

public TelphoneNumber(int[] n){
	phoneNum=n;
	two[0]='a';two[1]='b';two[2]='c';
	three[0]='d';three[1]='e';three[2]='f';
	four[0]='g';four[1]='h';four[2]='i';
	five[0]='j';five[1]='k';five[2]='l';
	six[0]='o';six[1]='p';six[2]='q';
	seven[0]='r';seven[1]='s';seven[2]='t';
	eight[0]='u';eight[1]='v';eight[2]='w';
	nine[0]='x';nine[1]='y';nine[2]='z';
}

public void printWords(){ printWords(0);}

private void printWords(int curDigit){
	if(curDigit==PHONE_NUMBER_LENGTH){
		System.out.println(new String(result));
		count++;
		return;
	}
	
	for(int i=0; i<3; ++i){
		result[curDigit]=getCharKey(phoneNum[curDigit],i);
		printWords(curDigit+1);
		if(phoneNum[curDigit]==0||phoneNum[curDigit]==1) return;
	}

	
}	
	private char getCharKey(int n, int i){
	if(n==2){for(int k=0;k<3;k++){if(k==i){return two[i];}}}
	if(n==3){for(int k=0;k<3;k++){if(k==i){return three[i];}}}
	if(n==4){for(int k=0;k<3;k++){if(k==i){return four[i];}}}
	if(n==5){for(int k=0;k<3;k++){if(k==i){return five[i];}}}
	if(n==6){for(int k=0;k<3;k++){if(k==i){return six[i];}}}
	if(n==7){for(int k=0;k<3;k++){if(k==i){return seven[i];}}}
	if(n==8){for(int k=0;k<3;k++){if(k==i){return eight[i];}}}
	if(n==9){for(int k=0;k<3;k++){if(k==i){return nine[i];}}}
	if(n==1){return 1;}
	return 0;
	}


		public static void main(String args[]){
			int num[]= new int[]{2,3,4,5,6,7,8,9};
			TelphoneNumber test = new TelphoneNumber(num);
			test.printWords();
			System.out.println(test.count);
		}
}