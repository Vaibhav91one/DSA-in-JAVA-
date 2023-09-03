package LinkedList;

public class SeggregateEvenOdd {
    Node divide(int N, Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node es = null;
        Node eE = null;
        Node os = null;
        Node oE = null;

        for(Node curr = head; curr != null; curr = curr.next){
            if(curr.data % 2 == 0){
                if(es == null){
                    es = curr;
                    eE = es;
                }
                else{
                    eE.next = curr;
                    eE = eE.next;
                }
            }
            else{
                if(os == null){
                    os = curr;
                    oE = os;
                }
                else{
                    oE.next = curr;
                    oE = oE.next;
                }
            }
        }
        if(os == null){
            eE.next = null;
            return es;
        }
        else if(es == null){
            oE.next = null;
            return os;
        }
        eE.next = os;
        oE.next = null;
        return es;
    }
}
