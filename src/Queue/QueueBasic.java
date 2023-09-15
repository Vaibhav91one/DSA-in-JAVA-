package Queue;
import  java.util.Queue;
public class QueueBasic {
    public void main(String[] args){
        Queue q = new Queue(4);
    }

    class Queue{
        int cap;
        int size;
        int[] arr;

        Queue(int c){
            cap = c;
            size = 0;
            arr = new int[cap];
        }

        Boolean isFull(){
            return size == cap;
        }
        Boolean isEmpty(){
            return size == -1;
        }
        void enqueue(int x){
            if(isFull()){
                return;
            }
            arr[size] = x;
            size++;
        }

        int Dequeue(){
            if(isEmpty()){
                return -1;
            }

            //stack implement kardi bc
    //            int result = arr[size];
    //            size--;
    //            return result;

            int result = arr[0];
            for(int i = 0; i < size-1; i++){
                arr[i] = arr[i+1];
            }
            size--;

            return result;
        }

        int GetFront(){
            if(isEmpty()){
                return -1;
            }
            return arr[0];
        }

        int GetRear(){
            if(isEmpty()){
                return -1;
            }
            return arr[size-1];
        }
    }
}
