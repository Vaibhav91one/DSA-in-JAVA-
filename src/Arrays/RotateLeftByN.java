package Arrays;

import java.util.Arrays;

public class RotateLeftByN {

    public static void main(String[] args){
        int N = 7;
        int D = 2;
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

//This is fine but take O(N*d) and auxiliary space O(1)

/*        for(int i = 0; i < D; i++){
            rotateArr(arr,D,N);
        }
       for (int j : arr) System.out.print(j + " ");
*/

//This is called the juggling algorithm which uses GCD Concept and take O(N*d) and O(1) aux space

        JugglingrotateArr(arr,D,N);
//        for (int j : arr) System.out.print(j + " ");
    }
    static void rotateArr(int[] arr, int d, int n)
    {
        int a = arr[0];
        for(int i = 1; i < n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = a;

    }

    public static int gcdCalc(int a, int b){
        if(b == 0){
            return a;
        }
        else{
            return gcdCalc(b, a % b);
        }
    }

    static void JugglingrotateArr(int[] arr, int d, int n)
    {
//        In case d>=n
        d = d % n;
        int i, j, k , temp;
        int gcd = gcdCalc(n,d);
        for(i = 0; i < gcd; i++){
            temp = arr[i];
            j = i;
            for (int x : arr) System.out.print(x + " ");
            System.out.println("\n");
            while(true){
                k = j + d;
                System.out.print(k + " ");
                System.out.println("\n");
                if(k >= n){
                    k = k - n;
                }
                if(k == i){
                    break;
                }
                arr[j] = arr[k];
                j = k;
                for (int x : arr) System.out.print(x + " ");
                System.out.println("\n");

            }
            arr[j] = temp;
            for (int x : arr) System.out.print(x + " ");
        }
    }
}

/*

Idea:
Solution 1: Rotate one by one
for the first solution, it is simple just write a program for left rotate by one and then call that function the no of rotations required. but  this is not the optimized solution

Solution 2: Using a Juggling algorithm
In this algorithm we use gcd to find the no of sets required for rotation of specific element that needs to be rotated in order for the array to rotate by d.
For example, in the above array the gcd would be 1
Also we would first store the first element of that set in a temp and replace it with the last element in the set.
so, the rotation will be like this:
[1,2,3,4,5,6,7]
for the first set where i = 0
we are shifting the j = i element with k = k + d element until k == i and if k >= n we adjust k such that k = k - n
1 2 3 4 5 6 7

3 2 3 4 5 6 7

3 2 5 4 5 6 7

3 2 5 4 7 6 7

3 2 5 4 7 6 2

3 4 5 4 7 6 2

3 4 5 6 7 6 2

3 4 5 6 7 1 2
*/