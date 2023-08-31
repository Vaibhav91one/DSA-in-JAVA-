package CircularLinkedList;

class Node{
    int data;
    Node next;
    Node(int x){
        this.data = x;
    }
}

public class Basics {
    public static void main(String[] args){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);

        a.next = b;
        b.next = c;
        c.next = a;

        a = InsertBeginning(a,5);
        a = InsertAtEnd(a,4);
        a = DeleteHead(a);
        a = DeleteKth(a, 3);
        TraverseCircular(a);
    }

    public static void TraverseCircular(Node head){
        if(head == null) return;

        Node curr = head;

        do{
            System.out.print(curr.data + "->");
            curr = curr.next;
        }while(curr!= head);
        System.out.print(head.data);
    }

    public static Node InsertBeginning(Node head, int x){
        Node temp = new Node(x);
        if(head == null){
         temp.next = temp;
         return temp;
        }
        temp.next = head.next;
        head.next = temp;

        int temp1 = head.data;
        head.data = temp.data;
        temp.data = temp1;

        return head;
    }

    public static Node InsertAtEnd(Node head, int x){
        Node temp = new Node(x);
        if(head == null){
            temp.next = temp;
            return temp;
        }
        temp.next = head.next;
        head.next = temp;

        int temp1 = head.data;
        head.data = temp.data;
        temp.data = temp1;

        return temp;
    }

    public static Node DeleteHead(Node head){
        if(head == null || head.next == head) return null;

        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }

    public static Node DeleteKth(Node head, int k){
        if(head == null) return null;

        if(k == 1){
            head.data = head.next.data;
            head.next = head.next.next;
            return head;
        }

        Node curr = head;
        for(int i = 0; i < k - 2; i++){
            curr = curr.next;
        }

        curr.next = curr.next.next;

        return head;
    }
}
