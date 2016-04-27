import java.io.*;
import java.util.*;
public class InsertionSort {
	public static void insertionSortPart2(int[] ar)
    {       
           // Fill up the code for the required logic here
           // Manipulate the array as required
           // The code for Input/Output is already provided
        for(int i = 1; i < ar.length; i++) {
            int cur = ar[i];
            for(int j = i-1; j >= 0; j--) {
                if(cur >= ar[j]){
                    ar[j+1] = cur;
                    printArray(ar);
                    break;
                } 
                else{
                    ar[j+1] = ar[j];
                    if(j == 0) {
                        ar[j] = cur;
                        printArray(ar);
                    }

                }
            }
        }
    }  
    
    
      
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}
