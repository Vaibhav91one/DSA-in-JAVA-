package Arrays;

public class RotateRightbyN {

    public static void main(String[] args){
        int[] nums = {-1};
        int k = 2;
        rotate(nums, k);
    }
    public static void rotate(int[] nums, int k) {
     k = k % nums.length;
     reverse(nums, 0, nums.length - 1);
     reverse(nums, 0, k - 1);
     reverse(nums, k, nums.length - 1);
     for(int j : nums) System.out.print(j + " ");
    }

    public static void reverse(int[]nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

/*
Idea: While I was understanding the juggling algorithm, I came across the right rotation of elements by N. And It was really easy to do if you know what you wer doing.
We were first reversing the whole array
and then reversing the element from 0 to k - 1, which were the last three elements in the original array
and then reversing the elements from k to nums.lenght, other elements
and that is it.
 */
