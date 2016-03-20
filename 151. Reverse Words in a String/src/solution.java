
public class solution {
	public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");// we should get familiar with regex in java.
        StringBuilder sb = new StringBuilder();
        if (words.length ==0)   return sb.toString();
                System.out.println(words[0]);
        for ( int i = words.length-1; i > 0; i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        sb.append(words[0]);
        return sb.toString();
    }
}
