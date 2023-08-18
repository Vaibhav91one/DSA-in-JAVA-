package Searching;

public class median2Sorted {
    public static void main(String[] args){
        int[] nums1 = {1,5,9};
        int[] nums2 = {2,3,6,7};
        int m = 3;
        int n = 4;
        System.out.println(findMedianSortedArrays(nums1, nums2, m, n));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2, int n1, int n2) {
     // we take the lenght of the smaller array
     int begin = 0;
     int end = n1;

     while(begin <= end){

//         mid value of the num1 array
         int i1 = (begin + end) / 2;
//         mid value of the num2 array
         int i2 = ((n1 + n2 - 1)/2) - i1;

         // checking if there is a right element, else -INF
         int max1 = i1 == 0? Integer.MIN_VALUE : nums1[i1 - 1];
         int max2 = i2 == 0? Integer.MIN_VALUE : nums2[i2 - 1];

         // checking if there is a left element, else +INF
         int min1 = i1 == n1? Integer.MAX_VALUE : nums1[i1];
         int min2 = i2 == n2? Integer.MAX_VALUE : nums2[i2];

         if(max1 <= min2 && max2 <= min1){
             if((n1 + n2) % 2 == 0){
                 return (double) (Math.max(max1, max2) + Math.min(min1, min2)) /2.0;
             }
             else{
                 return Math.max(max1,max2);
             }
         }
         else if(max1 > min2){
             end = i1 - 1;
         }
         else{
             begin = i1 + 1;
         }
     }
     return -1;
    }
}

//Not complete
