package LinkedList;
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

public class ReverseGroup {


    public static Node reverse(Node node, int k)
    {
     //checking for 0 or 1 nodes
     if(node == null || node.next == null){
         return node;
     }

     int count = 0;
     Node curr = node;
     Node prev_first = null; //necessary for linking groups
     boolean FirstPass = true; //necessary for first pass

     while(curr != null){
     Node first = curr;
     Node prev = null;

         //normal reverse linked list logic
         while(curr != null && count < k){
             Node next = curr.next;
             curr.next = prev;
             prev = curr;
             curr = next;
             count++;
        }
         //if first group then make the last node as head
         if(FirstPass){
             node = prev;
             FirstPass = false;
         }
         // link the previous first node to the next group
         else{
             prev_first.next = prev;
         }
         //maintaining the first node of each group
         prev_first = first;
     }
     return node;
    }

    public static Node reverseRecursive(Node node, int k)
    {
        //checking for 0 or 1 nodes
        if(node == null || node.next == null){
            return node;
        }

        int count = 0;
        Node curr = node;
        Node next = null;
        Node prev = null;
            //normal reverse linked list logic
        while(curr != null && count < k){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                count++;
        }
            //if first group then make the last node as head
        if(next != null){
            Node rest_head = reverseRecursive(next, k);
            node.next = rest_head;
        }
        return prev;
    }

    public int size(ListNode head){
        if(head == null){
            return 0;
        }
        if(head.next ==  null){
            return 1;
        }
        int p = 0;
        ListNode curr = head;

        while(curr != null){
            curr = curr.next;
            p++;
        }
        return p;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next ==  null){
            return head;
        }

        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        int count = 0;

        while(curr != null && count < k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }



        if(next != null && size(next)>=k){
            ListNode restHead = reverseKGroup(next, k);
            head.next = restHead;
        }
        else{
            head.next = next;
        }
        return prev;
    }
}
