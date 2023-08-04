package Arrays;
public class MaximumDifference {
    public static void main(String[] args){
        int[] arr = {2, 1, 8};
        System.out.println(MaxDiff(arr));
    }

    public static int MaxDiff(int[] arr){
        int minVal = arr[0];
        int res = 0;
        for (int i = 1; i < arr.length; i++){
            res = Math.max(res, arr[i] - minVal);
            minVal = Math.min(minVal, arr[i]);
        }
        if(res == 0){return -1;}
        return res;
    }
}

//Problem statements

/*
1. return the max difference from the array arr[j] - arr[i] such that j > i

2. Same question as calculating the maximum drawdown in O(n)

3. Asked in an interview. Given a list of tilt degree and asked to find the max tilt happened for a device in the same direction.
input arr = [-2,-1,0,1,2,1,2,3]
output = {"t0" : -2, "t4":2}

4. Exactly the same code as "best time to buy and sell stocks" :)

Problem statement
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

We are just finding the max difference that is max profit we want to get from the day we buy and the day we sell. so we have to check for a day index where j > i (Price is not negative),
and we get max(arr[j] - arr[i])

ex: Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
*/

/*
Approach:
we use two variables minval to store the currentmin value and res to store the resultant of the maximum difference between the (current element - minVal) and res
Also we keep track of current min value
How this works?
if we keep track of min value so that we don't get a value that is greater than minVal and res will only be compared with a value that is smaller that the minVal
*/
