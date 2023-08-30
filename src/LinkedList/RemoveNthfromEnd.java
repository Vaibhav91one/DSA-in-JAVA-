package LinkedList;
class ListNode {
 int val;
 ListNode next;
ListNode() {}
 ListNode(int val) { this.val = val; }
ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class RemoveNthfromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }

        ListNode first = head;

        for(int i = 0; i < n; i++){
            first = first.next;
        }
        //if n becomes same as lenght of the linked list this means we have to remove the head
        if(first == null){
            return head.next;
        }

        ListNode second = head;

        while(first.next !=null){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return head;
    }
}
