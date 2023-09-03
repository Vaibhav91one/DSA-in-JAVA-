package LinkedList;

public class DetectAndDelete {
    public static void removeLoop(Node head){
        Node slow = head;
        Node fast = head;

        //this loop runs until slow reaches null this means head is not null
        // and fast pointers run until the end of the nodes
        while(slow!= null && fast!=null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            //if slow and fast becomes equal we check if it satisfies the algorithm of floyd
            // this is the first meeting
            if(slow == fast) {
                slow = head;
                //while not the first node of loop //second meeting
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                // we have found/reached the first node of the loop
                // we traverse fast once more to get the first node
                while(fast.next != slow){
                    fast = fast.next;
                }
                //replace the fast with null to remove the loop
                fast.next = null;

            }
        }




        //The algorithm states that the second time the slow and fast pointer meets they will meet at the first node of the loop;


    }

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        //The algorithm states that the second time the slow and fast pointer meets they will meet at the first node of the loop;
        return null;
    }
}
