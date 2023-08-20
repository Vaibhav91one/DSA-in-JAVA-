package GFGPOTD;

import java.util.Vector;

public class NextSmallestPalindrome {
    public static void main(String[] args) {
        int N = 11;
        int[] Num = {9, 4, 1, 8, 7, 9, 7, 8, 3, 2, 2};
        System.out.println(generateNextPalindrome(Num,N));
    }

    public static Vector<Integer> generateNextPalindrome(int[] num, int n) {
        Vector<Integer> ans = new Vector<>();
        int[] arr = new int[n];

        boolean flag = false;

        //storing half of the elements.
        for (int i = 0; i < n / 2; i++) {
            arr[i] = num[i];
        }

        // checking if the new number formed is bigger than the original number. (checking if n/2 + 1 is bigger or smaller)
        for(int i = 0; i < n/2; i++){
            if(arr[n/2-1-i] > num[n - n/2 + i]){
                flag = true;
                break;
            }
            else if(arr[n/2 - 1 -i] < num[n - n/2 + i]) break;
        }

        //if there is a greater element exists such that it is greater than original number
        if(flag){
            Vector<Integer> res = new Vector<>();

            // adding n/2 elements
            for(int i = 0; i < n/2; i++){
                res.add(arr[i]);
            }

            //in case of odd elements.
            if(n%2 == 1){
                res.add(num[n/2]);
            }

            //Adding arr[i] elements in reverse order.
            for(int i = n/2 -1; i >= 0; i--){
                res.add(arr[i]);
            }

            return res;
        }

        //in case flag is not true such that number is less than the original number
        int half[] = new int[n - n/2];

        //Storing n/2 elements
        for (int i = 0; i < n-n/2; i++){
            half[i] = num[i];
        }

        int carry = 1;

        //adding carry to the n/2 number
//        starting from n/2 to 0 element
        for(int i = n - n/2 - 1; i >= 0; i--){
//          adding carry to n/2 element
            int x = half[i] + carry;

            //checking carry from the addition of half[i] and carry
            carry = x/10;

            //storing the modified array element in the half array
            half[i] = x % 10;
        }

        //The above program will return carry 1 if all the element in the given array are same.
        if(carry == 1){
            ans.add(1);
            for(int i = 0; i < n -1; i++){
                ans.add(0);
            }
            ans.add(1);
        }
        //ex: [9,9,9,9] => next smallest palidrome = [9,9,9,9] + 1 => [1,0,0,0,1]

        //else we add answer to the array and also add the reverse of the array.
        else{
            for(int i = 0; i < n - n/2; i++){
                ans.add(half[i]);
            }
            for(int i = n/2 - 1; i >= 0; i--){
                ans.add(half[i]);
            }
        }

        return ans;
    }

}


