package Queue;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class maxSubarray {
    public static void main(String[] args){
        int N = 9; int K = 3;
        int[] arr = {1 ,2 ,3 ,1 ,4 ,5 ,2, 3 ,6};
    }

    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        Deque<Integer> dq = new LinkedList<>();
        ArrayList<Integer> al = new ArrayList<>();

        for(int i = 0; i < k; i++){
            while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }

        al.add(arr[dq.peek()]);

        for(int i = k; i < n; i++){
            while(!dq.isEmpty() && dq.peek() <= i - k){
                dq.removeFirst();
            }

            while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);

            al.add(arr[dq.peek()]);

        }
        return al;
    }

    static int[] max_of_subarraysLeet(int nums[], int k) {
        int n = nums.length;
        Deque<Integer> dq = new LinkedList<>();
        ArrayList<Integer> al = new ArrayList<>();

        for(int i = 0; i < k; i++){
            while(!dq.isEmpty() && nums[i] >= nums[dq.peek()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }

        al.add(nums[dq.peek()]);

        for(int i = k; i < n; i++){
            while(!dq.isEmpty() && dq.peek() <= i - k){
                dq.removeFirst();
            }

            while(!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);

            al.add(nums[dq.peek()]);

        }

        int[] arr = new int[al.size()];

        int j = 0;
        for(int num : al){
            arr[j] = al.get(j);
            j++;
        }

        return arr;
    }

}
