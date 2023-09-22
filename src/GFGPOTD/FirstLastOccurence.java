package GFGPOTD;
import java.util.ArrayList;
import java.util.Arrays;

public class FirstLastOccurence {
    public static void main(String[] args){
        int n = 9;
        int x=5;
        int arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
        System.out.println(find(arr,n,x));
    }

    static ArrayList<Integer> find(int arr[], int n, int x)
    {
        ArrayList<Integer> al = new ArrayList<>();

        int low = 0;
        int high = n - 1;

        while( low <= high){
            int mid = (low + high)/2;

            if(x > arr[mid]){
                low = mid + 1;
            }
            else if( x < arr[mid]){
                high = mid - 1;
            }

            else{
                if((mid == 0 || arr[mid - 1] != arr[mid])){
                    al.add(mid);
                    break;
                }
                else{
                    high = mid - 1;
                }
            }

        }


        low = 0;
        high = n - 1;

        while( low <= high){
            int mid = (low + high)/2;

            if(x > arr[mid]){
                low = mid + 1;
            }
            else if( x < arr[mid]){
                high = mid - 1;
            }

            else{
                if((mid == n - 1 || arr[mid + 1] != arr[mid])){
                    al.add(mid);
                    return al;
                }
                else{
                    low = mid + 1;
                }
            }
        }

        al.add(-1);
        al.add(-1);
        return al;
    }
}
