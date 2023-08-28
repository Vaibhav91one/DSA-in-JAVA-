package GfdContest;

public class flip {
    public static void main(String[] args){
        int N = 8;
        String s = "11001100";
    }

    public String flipCoins(int N,String s) {
        int count = 0;
        for(int i = 0; i < N; i++){
            if(s.charAt(i) == '0'){
                count++;
            }
        }
        if(count % 2 !=0){
            return "No";
        }
        return "Yes";
    }
}
