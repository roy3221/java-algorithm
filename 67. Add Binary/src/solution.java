
public class solution {
	public String addBinary(String a, String b) {
        int carry = 0;
        int i = a.length()-1;
        int j = b.length()-1;
        StringBuilder sb = new StringBuilder();
        while ( i>=0 || j>=0){
            int digitA = 0;
            int digitB = 0;
            if( i >= 0)
                digitA = Character.digit(a.charAt(i), 10);
            if( j >= 0)
                digitB = Character.digit(b.charAt(j), 10);
            int Add = digitA + digitB + carry;
            switch (Add){
                case 0:
                    sb.insert(0,0);
                    carry = 0;
                    break;
                case 1:
                    sb.insert(0,1);
                    carry = 0;
                    break;
                case 2:
                    sb.insert(0,0);
                    carry = 1;
                    break;
                case 3:
                    sb.insert(0,1);
                    carry = 1;
                    break;                    
            }
            i--;
            j--;
            
        }
        if ( carry ==1 )
            sb.insert(0,1);
        return sb.toString();
    }
}
