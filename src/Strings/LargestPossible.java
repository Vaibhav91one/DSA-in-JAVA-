package Strings;

public class LargestPossible {
    public static void main(String[] args){
        int N = 2;
        int S = 9;
        System.out.println(findLargest(N,S));
    }
    static String findLargest(int N, int S){
        StringBuilder str = new StringBuilder("");
        int temp = S;
        int x = 0;

        if(S == 0 && N > 1) {
            return "-1";
        }

        for (int i = 0; i < N; i++) {
            if (temp >= 9) {
                str.append("9");
                x = x + 9;
                temp = temp-9;
            } else {
                str.append(temp);
                x = x + temp;
            }
        }

        if (x != S) {
            return "-1";
        }
        return str.toString();
    }
}
