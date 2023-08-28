package LinkedList;

public class RemoveDuplicates {
    public static void main(String[] args){

    }

    Node removeDuplicates(Node head)
    {
        Node curr = head;

//        checking if there are 0 zero elements or only 1 element
        while(curr != null && curr.next!=null){
//            if duplicate found skip the first duplicate node
            if(curr.data == curr.next.data){
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }
        return head;
    }
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
}
