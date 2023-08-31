package DoublyLinkedList;

class Node{
    int data;
    Node next;
    Node prev;
    Node(int x){
        this.data = x;
        next = prev = null;
    }
}
public class Basics {

    public static void main(String[] args){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);

        a.next = b;
        a.prev = null;
        b.next = c;
        b.prev = a;
        c.next = null;;
        c.prev = b;

        a = InsertAtBegin(a, 4);
        a = InsertAtEnd(a, 5);
        a = DeleteHead(a);
        a = DeleteLast(a);
        TraversalDoubly(a);
        a = ReverseDoubly(a);
        System.out.println();
        TraversalDoubly(a);
    }

    public static void TraversalDoubly(Node head){
        if(head == null) return;

        Node curr = head;
        System.out.print("null" + "<-");
        while(curr!=null){
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.print("null");
    }

    public static Node InsertAtBegin(Node head, int x){
        Node temp = new Node(x);

        if(head == null){
            return temp;
        }

        temp.next = head;
        head.prev = temp;

        return temp;
    }

    public static Node InsertAtEnd(Node head, int x){
        Node temp = new Node(x);
        if(head == null){
            return temp;
        }

        Node curr = head;

        while(curr.next != null){
            curr = curr.next;
        }

        curr.next = temp;
        temp.prev = curr;
        return head;
    }

    public static Node DeleteHead(Node head){
        if(head == null || head.next == null){
            return null;
        }

        head.next.prev = null;
        return head.next;
    }

    public static Node DeleteLast(Node head){
        if(head == null || head.next == null){
            return null;
        }

        Node curr = head;

        while(curr.next != null){
            curr = curr.next;
        }

        curr.prev.next = null;
        return head;
    }

    public static Node ReverseDoubly(Node head){
      if(head == null || head.next == null){
          return head;
      }
      Node curr = head;
      Node prev = null;
      Node next;
      while(curr != null){
          //storing the next node since links are going to be changed
          next = curr.next;
          //Swapping the links
          curr.next = prev;
          curr.prev = next;
          //Storing the prev node since links are changed
          prev = curr;
          // making the curr node as next for traversal
          curr = next;
      }
      return prev;
    }

}
