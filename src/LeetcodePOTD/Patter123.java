package LeetcodePOTD;

import java.util.Stack;

public class Patter123 {
    public static void main(String[] args){

    }

    public boolean find132pattern(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int n = nums.length;
        int third = Integer.MIN_VALUE;

        // what is happpening
        // hm phele ek element push krta hai picha se
        // fir agr ek greater element ata hai top of stack se. to hm pop krta hai top element ko aur usko store krleta hai
        // aur fir agr ek chota element ata hai third se to fir hme pattern milgya
        // kyuki agr ek greater element ara hai (j) to vo k(third number) se to bda hai hi, hme bss ensure krna hai ki hmara third number hai vo bda hai hmara current number se
        for(int i = n - 1; i >= 0; i--){
            if(nums[i] < third) return true;
            while(!s.isEmpty() && s.peek() < nums[i])
                third = s.pop();

            s.push(nums[i]);
        }
        return false;
    }
}
