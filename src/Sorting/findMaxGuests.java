package Sorting;
import java.util.Arrays;
public class findMaxGuests {
    public static void main(String[] args){
        int N = 5;
        int[] Entry= {1, 2,10, 5, 5};
        int[] Exit = {4, 5, 12, 9, 12};
        System.out.print(Arrays.toString(findMaxGuests(Entry,Exit,N)));
    }

    public static int[] findMaxGuests(int[] Entry,int Exit[], int N){
        //Sorting Entry and Exit array.
        Arrays.sort(Entry);
        Arrays.sort(Exit);

        //Starting from Entry guest as 1
        int i = 1;
        //Starting from 0 departures
        int j = 0;
        int res = 1;
        int curr = 1;
        //keeping track of the guest entry time.
        int time = Entry[0];
        int[] ans = new int[2];

        while(i < N && j < N){
//            whenever there is a arrival increase guest count
            if(Entry[i] <= Exit[j]){
                curr++;
//            updating current arrival time if guest count is more
                if(curr > res){
                    time = Entry[i];
                }
                i++;
            }
//            whenever there is a departure,decrease guest count
            else{
                curr--;
                j++;
            }
//          maximum guests
            res = Math.max(res, curr);
        }
        ans[1] = time;
        ans[0] = res;
        return ans;
    }
}
