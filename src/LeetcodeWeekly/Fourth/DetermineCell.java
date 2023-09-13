package LeetcodeWeekly.Fourth;

public class DetermineCell {
    public static void main(String[] args){
        int sx = 2, sy = 4, fx = 7, fy = 7, t = 6;
    }

    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
         int maxTime = (fx-sx);

         if(maxTime <= t){
             return true;
         }
         return false;
    }
}
