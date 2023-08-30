package LinkedList;

public class InsertKth {
    public static Basics.Node InsertSpecfic(Basics.Node head, int x, int pos){
        Basics.Node temp = new Basics.Node(x);

        if(pos == 1){
            temp.next = head;
            return temp;
        }

        // pos - 2 because -1 for 0 based indexing and -1 again for getting the element previous to where insertion is going to happen

        Basics.Node curr = head;
        for(int i = 0; i < pos - 2 && curr!=null ; i++){
            curr = curr.next;
        }

        //returning if pos is greater than the linked list
        if(curr == null) return head;

        temp.next = curr.next;
        curr.next = temp;

        return head;
    }
}
