package Searching;

public class median2Sorted {
    public static void main(String[] args){
        int[] nums1 = {1,5,9};
        int[] nums2 = {2,3,6,7};
        int m = 3;
        int n = 4;
    }

    public static double findMedianSortedArrays(int n, int m, int[] a, int[] b) {
                if(n>m){
                    return findMedianSortedArrays(m,n, b, a);
                }
                int start=0,end=n;
                int partition=(n+m+1)/2;
                while(start<=end){
                    int cut1=(start+end)/2;
                    int cut2=partition-cut1;

                    int left1=cut1 != 0 ? a[cut1-1] : Integer.MIN_VALUE;
                    int left2=cut2 != 0 ? b[cut2-1] : Integer.MIN_VALUE;

                    int right1=cut1 != n ? a[cut1] : Integer.MAX_VALUE;
                    int right2=cut2 != m ? b[cut2] : Integer.MAX_VALUE;

                    if(left1<=right2 && left2<=right1){
                        double ans=0;
                        if((n+m)%2==0){
                            return (Math.max(left1,left2)+Math.min(right1,right2))/2.0;
                        }else{
                            return Math.max(left1,left2);
                        }
                    }

                    if(left1>right2){
                        end=cut1-1;
                    }else{
                        start=cut1+1;
                    }
                }
                return 0.0;
            }
    }


//check leetcode solutions
