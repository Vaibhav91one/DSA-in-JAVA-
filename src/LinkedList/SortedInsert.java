package LinkedList;

public class SortedInsert {
    public static Basics.Node SortedInsert(Basics.Node head, int x){
        Basics.Node temp = new Basics.Node(x);

        //if no element we simply return temp new node;
        if(head == null){
            return temp;
        }

        //if head is smaller than the element to be inserted (since this is a sorted linked list
        if(head.data < x){
            temp.next = head;
        }

        Basics.Node curr = head;

        //this will exit when we reach the end, or we find an element which is greater than x
        while(curr.next!=null && curr.next.data < x){
            curr = curr.next;
        }

        temp.next = curr.next;
        curr.next = temp;

        return head;
    }
}
