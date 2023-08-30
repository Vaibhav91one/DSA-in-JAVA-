package LinkedList;

public class ReverseLinkedLIst {
    public static Basics.Node ReverseLinkedList(Basics.Node head){
        if(head == null) return null;
        if(head.next == null) return head;

        Basics.Node prev = null;

        Basics.Node curr = head;
        while(curr!=null){
            Basics.Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
