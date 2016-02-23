package happyNo;

import java.util.ArrayList;

public class happyNO {
    public boolean isHappy(int n) {
        int count=0;
        ArrayList<Integer> tmp= new ArrayList<Integer>();
        ArrayList<Integer> digit= new ArrayList<Integer>();
        int result=0;
        int j=n;
        System.out.println(tmp);
        String strInput = String.valueOf(n);
        int len = strInput.length();
        for(int i=len-1; i >=0; i--) {
            digit.add( Character.getNumericValue(strInput.charAt(i)));
        }
       while(result!=1&&n!=1){
            count++;
            for(int i=0;i<digit.size();i++){
            result+=Math.pow(digit.get(i),2);
            }
            digit.clear();
            if(tmp.contains(result)||count==243){
                return false;
            }else{
           tmp.add(result);
           String strInput1 = String.valueOf(result);
        int len1 = strInput1.length();
        for(int i=len1-1; i >=0; i--) {
            digit.add( Character.getNumericValue(strInput1.charAt(i)));
        }
           }
        }
       return true; 
    }
}
