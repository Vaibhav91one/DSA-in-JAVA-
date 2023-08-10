package Arrays;

public class MinimumNoOfFlips {
    public static void main(String[] args){
        int[] arr = {0, 0, 1, 1, 0, 0, 1, 1, 0, 1};
        int n = arr.length;
        MinFlips(arr,n);
    }

    public static void MinFlips(int arr[], int n){
        for(int i = 1 ; i < n; i++){
            if(arr[i] != arr[i-1]){
                if(arr[i] != arr[0]){
                    System.out.print("FROM "+ i + " TO ");
                }
                else{
                    System.out.println(i-1);
                }
            }
        }
        if(arr[n-1] != arr[0]){
            System.out.println(n - 1);
        }
    }
}

/*
Idea: For this we follow a property where if the count of 0s and 1s groups are equal then the difference is 0 or else if count of 0s and 1s are not same then the difference is atmost 1
      So, we start flipping from the second group.
      and that is what the code is doing.

      First it is starting from the second element and checking if it is same as the previous one if not then see if it is not equal to the first element,then it is the start of a new interval. else
      if it is same as the first element, then the i-1 element was the end of the interval.

      At last, we check if the last element is equal to first element or not because in case such as
      {1,1,0,0,1,0} in the last iteration it will just print FROM 5 to and to complete this we check if last element is equal to arr[0] that is 0 or not , if not then we print n-1

      Also, the count differs by one if the first and last elements are different.
 */
