import java.util.ArrayList;
import java.util.List;

public class Solution {
    
   /* two pointer
   public List<String> generatePossibleNextMoves(String s) {
        List<String> result = new ArrayList<>();
        if(s.length() <= 1) return result;
        int slow = 0;
        int fast = 1;
        char[] chs = s.toCharArray();
        while(fast < chs.length) {
            System.out.println("chs[slow]= "+chs[slow]+";chs[fast]= "+ chs[fast]);
            if(chs[slow] == '+' &&chs[fast] == '+') {
                while(fast < chs.length && chs[fast] == '+'){
                    chs[slow] = '-';
                    chs[fast] = '-';
                                System.out.println("slow= "+slow+";fast= "+ fast);

                    result.add(new String(chs));
                    chs = s.toCharArray();
                    ++fast;
                    ++slow;
                }
                ++fast;
                ++slow;               
            }else if(chs[slow] == '-' &&chs[fast] == '+') {
                while(fast+1 < chs.length && chs[fast+1] == '+'){
                    ++fast;
                    ++slow;
                    chs[slow] = '-';
                    chs[fast] = '-';
                                System.out.println("slow= "+slow+";fast= "+ fast);

                    result.add(new String(chs));
                    chs = s.toCharArray();
                }
                ++fast;
                ++slow;
            }else{
                 ++fast;
                 ++slow;
            }
        }
        return result;
    }*/
    
    /* A shorter solutiokn
    public List<String> generatePossibleNextMoves(String s) {

    List<String> list = new ArrayList<String>();

    for (int i = 1; i < s.length(); i++) {
        if (s.charAt(i) == '+' && s.charAt(i - 1) == '+') {
            list.add(s.substring(0, i - 1) + "--" + s.substring(i + 1, s.length()));
        }
    }

    return list;

    }*/
    
    /* Another version*/
    public List<String> generatePossibleNextMoves(String s) {
    List list = new ArrayList();
    for (int i=-1; (i = s.indexOf("++", i+1)) >= 0; )
        list.add(s.substring(0, i) + "--" + s.substring(i+2));
    return list;
    }
}