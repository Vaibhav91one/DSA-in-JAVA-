package LinkedList;

public class DetectLoopInLinkedList {

    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }


    public static boolean detectLoop(Node head){
     Node slow = head;
     Node fast = head;

     //fast == null in case of even nodes
        //fast.next == null in case of odd node
     while(fast!=null && fast.next!= null){
         slow = slow.next;
         fast =  fast.next.next;
         if(slow == fast) return true;
     }
     return false;
    }
}
