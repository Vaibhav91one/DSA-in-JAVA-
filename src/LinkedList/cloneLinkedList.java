package LinkedList;
//class Node {
//    int val;
//    Node next;
//    Node random;
//
//    public Node(int val) {
//        this.val = val;
//        this.next = null;
//        this.random = null;
//    }
//}
public class cloneLinkedList {
//    public Node copyRandomList(Node head) {
//        if(head == null) return null;
//        Node curr = head;
//        while(curr!=null){
//            Node next = curr.next;
//            curr.next = new Node(curr.val);
//            curr.next.next = next;
//            curr = next;
//        }
//        curr = head;
//        while(curr!=null){
//            curr.next.random = (curr.random!=null)? curr.random.next : null;
//            curr = curr.next.next;
//        }
//
//        curr = head;
//        Node clonedList = head.next;
//        while(curr != null){
//            Node next = curr.next.next;
//            Node copy = curr.next;
//            curr.next = next;
//            if(next != null){
//                copy.next = next.next;
//            }
//            curr = next;
//        }
//
//        return clonedList;
//    }
}
