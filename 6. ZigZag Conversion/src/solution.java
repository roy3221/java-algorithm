
public class solution {
	public String convert(String s, int numRows) {
	      char[] words = s.toCharArray();
	      StringBuffer[] rows = new StringBuffer[numRows];
	      for ( int i = 0; i < rows.length; i++){
	          rows[i] = new StringBuffer();
	      }
	      
	      int i = 0;
	      while (i < words.length){
	          for ( int j = 0; j < rows.length && i<words.length; j++){
	              rows[j].append(words[i++]);
	          }
	          for ( int j = rows.length-2; j>0 && i<words.length; j--){
	              rows[j].append(words[i++]);
	          }
	      }
	      
	      for ( int k = 1; k< rows.length; k++)
	        rows[0].append(rows[k]);
	    return rows[0].toString();
	    }
}
