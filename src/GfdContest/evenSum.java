package GfdContest;

import java.util.ArrayList;

public class evenSum {
    public static void main(String[] args){
        int N = 6;
        int[] B = {16 ,16 ,16 ,16 ,16 ,1};
        System.out.println(findMin(B,N));
    }
    static int findMin(int A[], int n)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        int countEven = 0;
        int operations = 0;
        int sum = 0;
        int j = 0;
        for(int i = 0; i < n; i++){
              if(A[i] % 2 == 0){
                  al.add(A[i]);
                  countEven++;
              }
              sum += A[i];
        }
        System.out.println(sum);
        if(sum % 2 == 0) return 0;
        if(countEven == 0) return -1;
        while(sum % 2 != 0 && j < al.size()){
            while(al.get(j) % 2 == 0){
                sum -= al.get(j)/2;
                al.set(j, al.get(j)/2);
                operations++;
            }
            j++;
        }
        return operations;
    }
}
