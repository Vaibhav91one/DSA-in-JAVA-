package LeetcodeWeekly.Fourth;
import java.util.HashSet;
import java.util.List;
public class PointsThatIntersect {
    public static void main(String[] args){
int[][] nums = {{1,3},{5,8}};
     numberOfPoints(nums);
    }

    public static int numberOfPoints(List<List<Integer>> nums) {
        HashSet<Integer> h = new HashSet<>();
        for(int i = 0; i < nums.toArray().length; i++){
            for(int j = nums.get(i).get(0); j <= nums.get(i).get(1); j++){
                h.add(j);
            }
        }
        return h.size();
    }

    public static int numberOfPoints(int[][] nums) {
        HashSet<Integer> h = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            for(int j = nums[i][0]; j <= nums[i][1]; j++){
                h.add(j);
            }
        }
    return h.size();
    }
}
