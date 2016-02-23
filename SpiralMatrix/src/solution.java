import java.util.*;


public class solution {
	 List<Integer> res= new ArrayList<>();
	    public List<Integer> spiralOrder(int[][] matrix) {
	        if(matrix.length==0) return res;
	        int wide=matrix[0].length;
	        int height=matrix.length;
	        System.out.println("wide="+wide);
	        System.out.println("height="+height);	
	        if(wide==1){
	            for(int i=0;i<height;i++){
	                res.add(matrix[i][0]);
	            }
	            return res;
	        }
	        if(height==1){
	            for(int i=0;i<wide;i++){
	                res.add(matrix[0][i]);
	            }
	            return res;
	        }
	        helper(matrix,res,height,wide);
	        return res;
	    }
	    
	    private void helper(int [][] matrix,List<Integer> res,int height, int wide){
	        for(int i=0; i<wide;i++){
	            res.add(matrix[0][i]);
	            System.out.println("1!!");
	        }
	        for(int i=1; i<height;i++){
	            res.add(matrix[i][wide-1]);
	            System.out.println("2!!");
	        }
	        for(int i=wide-2;i>=1;i--){
	            res.add(matrix[height-1][i]);
	            System.out.println("3!!");
	        }
	        for(int i=height-1;i>=1;i--){
	            res.add(matrix[i][0]);
	            System.out.println("4!!");
	        }
	      /*  if(height-2*level>0&&wide-2*level>0){
	            helper(matrix,res,level);
	        }*/
	    }
	    public static void main(String args[]){
	    	int [][] matrix={{2},{3}};
	    	System.out.println(new solution().spiralOrder(matrix));
	    }
}
