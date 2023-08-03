package Recursion;

public class Josephus {
    public static void main(String[] args){
        int n = 5;
        int k = 3;
        System.out.println(Winner(n,k) + 1);
    }

    public static int Winner(int n, int k){
        if(n == 1){
            return 0;
        }
        return ((Winner(n-1,k)) + k) % n;
    }
}

/*
Problem statement:
josephus want to kill the kth person.
Idea:
We use a recursive approach here, we use the base case when only 1 member is remaining we return 0
and when a recursive call is done we decrease the size to n - 1 and shift remains the same, but to make sure that the current recursive call starts from the last recursive call
we use +k and to avoid index out of bonds we use circular traversing % n

by shift remains same I mean the recursive call will again start from 0 to make it duplicate of previous call/ to start from where we left we add K

assume n = 5 and k = 3
in this code we start from 0 to 4 and later add +1 this does not change any meaning.
also imagine this being circular in nature
1 2 3 4 5 - start from 1 and according to k element 3 get killed
1 2 4 5   - start from  4 and 1 gets killed
2 4 5   - start from  2 and 5 gets killed
2 4    - start from  2 and 2 gets killed
 */
