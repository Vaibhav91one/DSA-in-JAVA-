package LinkedList;

public class DeleteGreaterNode {
    public static void main(String[] args){

    }

    static Node compute(Node head)
    {
        if(head == null||head.next==null){
            return head;
        }
        Node nex= compute(head.next);
        Node curr=head;
        if(curr.data<nex.data){
            curr=nex;
            head=curr;
        }else{
            curr.next=nex;
            head=curr;
        }
        return head;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
}
