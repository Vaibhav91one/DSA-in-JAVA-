package LeetcodePOTD;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
public class StringChain {
    public static void main(String[] args){
        String[] words = {"a","b","ba","bca","bda","bdca"};
        longestStrChain(words);
    }
    public static int longestStrChain(String[] words) {
        Arrays.sort(words, (String a, String b) -> a.length() - b.length()); // sort by length
        System.out.println(Arrays.toString(words));
        Map<String, Integer> dp = new HashMap<>();

        int maxPath = 1;
        // same idea behind the previous approach but performed iteratively.
        for (String word: words) {
            int currLength = 1;
            StringBuilder sb = new StringBuilder(word);
            System.out.println("This is word " + word);
            for (int i=0; i<word.length(); i++) {
                sb.deleteCharAt(i);
                String prevWord = sb.toString();
                System.out.println(prevWord);
                currLength = Math.max(currLength, dp.getOrDefault(prevWord, 0) + 1);
                sb.insert(i, word.charAt(i));
            }
            dp.put(word, currLength);
            maxPath = Math.max(maxPath, currLength);
        }

        return maxPath;
    }
}
