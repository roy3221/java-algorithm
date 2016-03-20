
public class solution {
	public String countAndSay(int n) {
        String result = "1";
        for (int outer = 1; outer < n; outer++) {
            String previous = result;
            result = "";
            int count = 1;
            char say = previous.charAt(0);

            for (int i = 1; i < previous.length(); i++) {
                if (previous.charAt(i) != say) {
                    result = result + count + say;
                    count = 1;
                    say = previous.charAt(i);
                } else count++;
            }
            result = result + count + say;
        }
        return result;
    }
}
