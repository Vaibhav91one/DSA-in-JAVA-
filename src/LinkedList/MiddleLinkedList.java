package LinkedList;

public class MiddleLinkedList {
    public static int MiddleLinkedList(Basics.Node head){
        if(head == null){
            return -1;
        }

        Basics.Node slow = head;
        Basics.Node fast = head;

        //fast jumps two nodes at a time
        //slow jumps one node at a time.

//        exiting conditions
        //if there are even node fast == null
        //if odd nodes fast.next == null
        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
}
