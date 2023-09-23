import java.util.ArrayList;
import java.util.List;
public class Citadel {
    public static void main(String[] args){
        List<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(2);
        a.add(4);
        a.add(1);

        List<Integer> b = new ArrayList<>();
        b.add(3);
        b.add(6);
        b.add(2);
        b.add(2);
        System.out.println(getMaxSubarrayLen(a,b));
    }

    public static int getMaxSubarrayLen(List<Integer> team_a, List<Integer> team_b) {
        int n = team_a.size();
        int maxLength = 0;

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                boolean isNonDecreasing = true;

                for(int k = i; k < j; k++){
                    if(team_a.get(k) > team_a.get(k+1) && team_b.get(k) > team_b.get(k+1)){
                        isNonDecreasing = false;
                        break;
                    }
                }
                if(isNonDecreasing){
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }
        return maxLength;
    }
}
