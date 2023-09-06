package LinkedList;

import java.util.ArrayList;


public class splitList {

    public ListNode[] splitListToParts(ListNode head, int k) {
        // Getting array from the class listnode and initializing with size k;
        ListNode[] a = new ListNode[k];
        int size = 0;
        int count = 0;

        ListNode curr = head;

        //getting the size of the linked list
        while(curr != null){
            size++;
            curr = curr.next;
        }

        //calculating the extra nodes
        int extraNodes = size % k;
        // calculating every partition size
        int nodeSize = size/k;

        // traversing the linkedlist
        for(int i = 0; i < k && head!=null; i++){
            a[i] = head;
            ListNode prev = null;

            int currNodeSize = nodeSize;
            if (extraNodes > 0) {
                extraNodes--;
                currNodeSize++;
            }

            for(int j = 0; j < currNodeSize; j++){
                prev = head;
                head = head.next;
            }
            prev.next = null;
        }

        return a;
    }
}
