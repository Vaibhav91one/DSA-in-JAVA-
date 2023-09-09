package stack;
import java.util.Stack;
public class Basics {
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    // stack using array
    class stack{
        int top = -1;
        int cap;

        int[] arr;
        stack(int cap){
            this.cap = cap;
            arr = new int[cap];
        }

        public void push(int x){
            if(top == cap-1){
                System.out.println("Overflow");
                return;
            }
            top++;
            arr[top] = x;
        }

        public int pop(){
            if(top == -1){
                System.out.println("Underflow");
                return -1;
            }
            int y = arr[top];
            top--;
            return y;
        }
    }

    class Node{
        int data;
        Node next;

        Node(int x){
            data = x;
        }
    }

    //LinkedList implementation of Stack
    class stackLinkedList{
        int top = -1;
        int cap;

        stackLinkedList(int cap){
            this.cap = cap;
        }

        public Node push(Node head, int x){
            if(top == cap-1){
                System.out.println("Overflow");
            }
            else{
                Node temp = new Node(x);
                temp.next = head;
                top++;
                return temp;
            }
          return null;
        }

        public int pop(Node head){
            if(top == -1){
                System.out.println("Underflow");
            }
            else{
                int res = head.data;
                head = head.next;
                return res;
            }
            return -1;
        }
    }
}
