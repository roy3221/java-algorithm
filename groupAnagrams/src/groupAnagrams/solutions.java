package groupAnagrams;

import java.util.*;

public class solutions {
	public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> AnagramGroup= new HashMap<>();
        List<List<String>> result= new ArrayList<List<String>>();
        for(int i=0;i<strs.length;i++){
            String word= strs[i];
            char[] charArray= word.toCharArray();
            Arrays.sort(charArray);
            String SortedWord= new String(charArray);
            if(!AnagramGroup.containsKey(SortedWord)){
                List<String> newAnagrams= new ArrayList<>();
                newAnagrams.add(strs[i]);
                AnagramGroup.put(SortedWord,newAnagrams);
            }else{
                List<String> existAnagrams= AnagramGroup.get(SortedWord);
                existAnagrams.add(strs[i]);
                sortThem(existAnagrams);// sort a list of strings!!!!
            }
        }
        result= new ArrayList<>(AnagramGroup.values());
        return result;
    }
	static private void sortThem(List<String> existAnagrams){
		Collections.sort(existAnagrams);
	}
	
	
	public static void main(String agrs[]){
		String [] strs={"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(new solutions().groupAnagrams(strs));
	}
}
