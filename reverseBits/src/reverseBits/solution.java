package reverseBits;

public class solution {
	
	public int reverseBits(int n) {
        if(n==0) return 0;
        String bi= Integer.toBinaryString(n);
        System.out.println(bi);
        StringBuilder sb = new StringBuilder();
        int[] bits= new int[32];
        int[] newbits= new int[32];
        int index=bi.length()-1;
        int dif=32-bi.length();
        char ch=' ';
        for(int i=31;i>=dif;i--){
            ch=bi.charAt(index--);
            bits[i]= Character.getNumericValue(ch);
        }
        for(int i=31;i>=0;i--){
                newbits[31-i]=bits[i];
                System.out.println(newbits[31-i]);                
        }
        int k=0;
        System.out.println("~~~~~~~~~~~bound~~~~~~~~~~~");                
        for(int i=0;i<newbits.length;i++){
            System.out.println(newbits[i]);                
        	if(newbits[i]==0) k++;
        	if(newbits[i]==1) break;
        }
        System.out.println(k);
        System.out.println(bi.length());
        for(int i=k;i<bi.length();i++){
        	sb.append(newbits[i]);
        }
        bi= sb.toString();
        System.out.println(bi);
        return Integer.parseInt(bi,2);
    }
	
	public static void main(String args[]){
		//solution test= new solution();
		//System.out.println(test.reverseBits(111111111));
		System.out.println(Integer.parseInt("11111111111111111111111111111111",2));
	}
}
