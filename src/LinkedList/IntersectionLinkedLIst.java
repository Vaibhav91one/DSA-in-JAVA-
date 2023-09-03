package LinkedList;

public class IntersectionLinkedLIst {
    int intersectPoint(Node head1, Node head2)
    {
        if(head1 == null && head2 == null) return -1;

        Node a = head1;
        Node b = head2;

        while(a != b){
            a = a==null? head2 : a.next;
            b = b==null? head1 : b.next;
            if(a != null & b != null && a == b) return a.data;
        }

        return -1;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null && headB == null) return null;
        if(headA == headB) return headA;

        ListNode a = headA;
        ListNode b = headB;

        while(a != b){
            a = a==null? headB : a.next;
            b = b==null? headA : b.next;
            if(a != null & b != null && a == b) return a;
        }

        return null;
    }
}
