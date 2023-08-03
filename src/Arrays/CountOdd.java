package Arrays;

public class CountOdd {
    public static void main(String[] args){
        int low = 3;
        int high = 7;
        System.out.println(countOdd(low,high));
    }

    public static int countOdd(int low, int high){
//        Naive
//        int res = 0;
//        for(int i = low; i <= high; i++){
//            if(i % 2 != 0){
//                res++;
//            }
//        }
//        return res;

//        Another Approach
//        int res = 0;
//        int i = low;
//
//        while(i<=high){
//            if(i % 2 != 0){
//                res++;
//            }
//            i++;
//        }
//        return res;

//        Most optimized/efficient

        int res = (high - low)/2;
        if(high % 2 == 0 && low % 2 == 0){
            return res;
        }
        return res + 1;
    }
}

/*
Idea:
we use maths LOL, if we subtract high and low and divide it with even (Half) if high and low are even we will get the result as the no of even numbers or half of numbers
and if high and low are odd or high is even, low is odd if we add +1 to result we get the no of odd numbers.
 */
