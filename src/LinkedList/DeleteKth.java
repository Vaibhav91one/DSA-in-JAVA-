package LinkedList;

public class DeleteKth {
    public static Basics.Node DeleteKth(Basics.Node head, int x){ //here x is the position

        //Deletions at head only corner cases
        if(head == null){
            return head;
        }
        //Deletions at head only corner cases
        if(x == 1){
            return head.next;
        }

        //Deletion in between
        // x - 2 because -1 for 0 based indexing and -1 again for getting the element previous to the element which is going to be deleted is going to happen
        Basics.Node curr = head;
        for(int i = 0; i < x - 2 && curr!=null ; i++){
            curr = curr.next;
        }

        //returning if pos is greater than the linked list
        if(curr == null) return head;

        curr.next = curr.next.next;

        return head;
    }
}
