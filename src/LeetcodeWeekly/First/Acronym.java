package LeetcodeWeekly.First;
import java.util.List;
import java.util.Arrays;
import java.util.Objects;

public class Acronym {
    public static void main(String[] args) {
        String[] words = {"an","apple"};
        List<String> wordList = Arrays.asList(words);

        String s = "a";
        System.out.print(isAcronym(wordList, s));
    }

    public static boolean isAcronym(List<String> words, String s) {

        StringBuilder res = new StringBuilder("");
        for (String word : words) {
            res.append(word.charAt(0));
        }
        if(Objects.equals(s, res.toString())){
            return true;
        }
        System.out.println(res);
        return false;
    }
}