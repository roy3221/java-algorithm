
public class Solution {
		   public boolean searchMatrix(int[][] matrix, int target) {

		    int row_num = matrix.length;
		    int col_num = matrix[0].length;

		    int begin = 0, end = row_num * col_num - 1;

		    while(begin <= end){
		        int mid = (begin + end) / 2;
		        int mid_value = matrix[mid/col_num][mid%col_num];

		        if( mid_value == target){
		            return true;

		        }else if(mid_value < target){
		            //Should move a bit further, otherwise dead loop.
		            begin = mid+1;
		        }else{
		            end = mid-1;
		        }
		    }

		    return false;
		    }
		        // another slow solution, beat 6.5%
		        // public boolean searchMatrix(int[][] matrix, int target) {
		        //     if(target < matrix[0][0])
		        //     return false;
		        //     int row_len = matrix.length;
		        //     int col_len = matrix[0].length;
		        //     int targetRow = 0;
		        //     for(int i=0; i<row_len; i++){
		        //         if(target == matrix[i][0])
		        //         return true;
		        //         if(target < matrix[i][0]){
		        //             targetRow = i-1;
		        //             break;
		        //         }
		        //         targetRow = i;
		        //     }
		        //     // can be improved.
		        //     for(int i=0; i<col_len; i++){
		        //         if( target == matrix[targetRow][i])
		        //         return true;
		        //     }
		        //   return false;  
		        // }

		    
		    
		    
		    //very slow solution,  beat 3%
		    // int[][] matrix;
		    // int target;
		    // double col;
		    // double row;
		    // public boolean searchMatrix(int[][] matrix, int target) {
		    //     this.matrix = matrix;
		    //     this.target = target;
		    //     if(matrix == null) 
		    //     return false;
		    //     this.row = matrix.length;
		    //     this.col = matrix[0].length;
		    //     return findTarget((int)Math.ceil(row/2), (int)Math.ceil(col/2));
		    // }
		    
		    // private boolean findTarget(int rowPosition, int colPosition){
		    //     if(matrix[rowPosition-1][colPosition-1] == target)
		    //     return true;
		        
		    //     if(matrix[rowPosition-1][colPosition-1] > target){
		    //         // if the # of items is small, we just iterative all the residule items.
		    //         if(colPosition<=50 && rowPosition<=50){
		    //             for(int i=0; i<rowPosition; i++){
		    //                 for(int j=0; j<col; j++){
		    //                     //System.out.println("i= "+i+"; j= "+j);
		    //                     if(matrix[i][j] == target){
		    //                     return true;
		    //                     } 
		    //                 }
		    //             }
		    //         }else{
		    //             findTarget((int)Math.ceil((double)rowPosition/2), (int)Math.ceil((double)colPosition/2));
		    //         }
		    //     }
		    //     if(matrix[rowPosition-1][colPosition-1] < target){
		    //         // if the # of items is small, we just iterative all the residule items.
		    //         if((col - colPosition<=50) && (row - rowPosition<=50)){
		    //             for(int i=rowPosition-1; i<row; i++){
		    //                 for(int j=0; j<col; j++){
		    //                     if(this.matrix[i][j] == this.target){
		    //                     return true;
		    //                     }
		    //                 }
		    //             }
		    //         }else{
		    //             findTarget((int)Math.ceil((row - rowPosition+1)/2), (int)Math.ceil((col - colPosition+1)/2));
		    //         }
		    //     }
		    //     this.col =  colPosition;
		    //     this.row =  rowPosition;
		    //     return false;
		    // }

}
