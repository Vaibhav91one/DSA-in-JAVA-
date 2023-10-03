package LeetcodePOTD;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveColored {
    public static void main(String[] args){
        String colors = "ABBBBBBBAAA";
        System.out.println(winnerOfGame(colors));
    }

    public static boolean winnerOfGame(String colors) {
        int A = 0;
        int B = 0;
        int n = colors.length();

        for(int i = 1; i < n-1; i++){
            char c = colors.charAt(i);
            if(c == 'A'){
                if(colors.charAt(i - 1) == c && colors.charAt(i + 1) == c){
                    A++;
                }
            }

            if(c == 'B'){
                if(colors.charAt(i - 1) == c && colors.charAt(i + 1) == c){
                    B++;
                }
            }
        }
        return A > B;
    }
}

//Count "AAA" and "BBB" and compare them
//
//        You can only remove an A that is surrounded by two other A's.
//        So if you keep on removing valid A's, then the valid B's are not affected. Same goes for all valid B's.
//        You just count all the valid A's and valid B's. At each turn, Alice removes a valid A and the count of all valid A's (countA) decreases by one. Similarly after Bob's turn, countB decreases by one.
//        So if countA > countB, then a turn comes when Bob has no valid B's to remove. So he loses and Alice wins. You return TRUE.
//        Else if countA == countB, then at some point Alice has no valid A's to remove, So Bob wins and you return FALSE.
//        Else (countA < countB), then at some point Alice has no valid A's to remove. So Bob wins and you return FALSE.
//
//        In either case, if countA <= countB, then you return FALSE.
//        So just return countA > countB.
