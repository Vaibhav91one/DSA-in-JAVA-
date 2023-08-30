package LinkedList;

public class FindNthFromLast {
    public static int LastNth(Basics.Node head, int n){
        if(head == null){
            return -1;
        }

        Basics.Node first = head;

        for(int i = 0; i < n; i++){
            if(first == null){
                return -1;
            }
            first = first.next;
        }

        Basics.Node second = head;

        while(first!=null){
            first = first.next;
            second = second.next;
        }
        return second.data;
    }
}
