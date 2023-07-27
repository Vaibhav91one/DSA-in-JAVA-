package Arrays;

public class Second_Largest {
    public static void main(String[] args){
        int[] arr = {1,24,3,45};
        int n = arr.length;
        System.out.println(arr[SecondLargestElement(arr,n)]);
    }

    public static int SecondLargestElement(int[] arr, int n){
        int res = -1;
        int largest = 0;
        for(int i = 1; i < n; i++){
            if(arr[i] > arr[largest]){
                res = largest;
                largest = i;
            } else if (arr[i] != arr[largest]) {
                if(arr[res] < arr[i]){
                    res = i;
                }
            }
        }
        return res;
    }
}

/*
Idea:
The idea here is to keep a res variable to keep track of the second-largest element and a variable largest for keeping the track of largest element in the array.
Firstly, largest references to the first element, res element is kept at -1.
The reason for keeping res to -1 is that there might be a case where all elements are largest that is are equal, So, there is no second-largest element.
Now,Whenever there are 2 cases that can arise:
    a[i] > a[largest] There is an element greater than the arr[largest] we change res to the largest element index and largest to i. (this means that second largest is res and the new largest is i)
    a[i] != a[largest] There might be a case where the other elements are not larger than the current largest element, but the second largest might be different.
                        Now, we check a[i] > a[res], if true than res = i.
Here, the index is i.So, res = i.
*/