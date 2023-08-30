package LinkedList;

public class Basics{

    static class Node{
        int data;
        Node next;
        Node(int x){
            this.data = x;
            this.next = null;
        }
    }
    public static void main(String[] args){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);

        a.next = b;
        b.next = c;
        c.next = d;

        a = InsertBegin(a,10);
        a = InsertEnd(a,10);
        a = DeleteFirst(a);
        a = Deletelast(a);
//        a = InsertSpecfic(a,5,3);
        a = SortedInsert(a,5);
//        a = SortedInsert(a,6);
//        a = SortedInsert(a,7);
//        a = SortedInsert(a,8);
//        a = SortedInsert(a,9);
//        a = SortedInsert(a,10);
//        a = DeleteKth(a, 3);
        traverse(a);
        System.out.println();
        traverseRecursive(a);
        System.out.println();
        System.out.println(Search(a,3));
        System.out.println(SearchRecursively(a,3));
        System.out.println(MiddleLinkedList(a));
        System.out.println(LastNth(a,2));
        System.out.println();
        a = ReverseLinkedList(a);
        traverseRecursive(a);

    }

    public static  void traverse(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.print("null");
    }

    public static  void traverseRecursive(Node head){
        if(head == null){
            System.out.print("null");
            return;
        }
        System.out.print(head.data+ "->");
        traverseRecursive(head.next);
    }

    public static int Search(Node head, int x){
        Node curr = head;
        int pos = 1;
        while(curr!=null){
            if(curr.data == x){
                return pos;
            }
            pos++;
            curr = curr.next;
        }
        return -1;
    }

    public static int SearchRecursively(Node head, int x){
        if(head == null){
            return -1;
        }

        if(head.data == x){
            return 1;
        }

        else{
            int res = SearchRecursively(head.next, x);
            if(res == -1) return -1;
            else return res+1;
        }
    }

    public static Node InsertBegin(Node head, int x){
        Node temp = new Node(x);
        temp.next = head;
        return temp;
    }

    public static Node InsertEnd(Node head, int x){
        Node temp = new Node(x);

        if(head == null){
            return temp;
        }

        Node curr = head;

        while(curr!=null && curr.next != null){
            curr = curr.next;
        }
        curr.next = temp;

        return head;
    }

    public static Node DeleteFirst(Node head){
        if(head == null){
            return head;
        }
        return head.next;
    }

    public static Node Deletelast(Node head){
        Node curr = head;
        if(head == null){
            return head;
        }
        if(head.next == null){
            return null;
        }
        while(curr!=null && curr.next.next != null){
            curr = curr.next;
        }

        curr.next = null;

        return head;
    }

    //Assuming pos in 1 indexed
    public static Node InsertSpecfic(Node head, int x, int pos){
        Node temp = new Node(x);

        if(pos == 1){
          temp.next = head;
          return temp;
        }

        // pos - 2 because -1 for 0 based indexing and -1 again for getting the element previous to where insertion is going to happen

        Node curr = head;
        for(int i = 0; i < pos - 2 && curr!=null ; i++){
            curr = curr.next;
        }

        //returning if pos is greater than the linked list
        if(curr == null) return head;

        temp.next = curr.next;
        curr.next = temp;

        return head;
    }


    public static Node DeleteKth(Node head, int x){ //here x is the position

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
        Node curr = head;
        for(int i = 0; i < x - 2 && curr!=null ; i++){
            curr = curr.next;
        }

        //returning if pos is greater than the linked list
        if(curr == null) return head;

        curr.next = curr.next.next;

        return head;
    }

    public static Node SortedInsert(Node head, int x){
        Node temp = new Node(x);

        //if no element we simply return temp new node;
        if(head == null){
            return temp;
        }

        //if head is smaller than the element to be inserted (since this is a sorted linked list
        if(head.data < x){
            temp.next = head;
        }

        Node curr = head;

        //this will exit when we reach the end, or we find an element which is greater than x
        while(curr.next!=null && curr.next.data < x){
            curr = curr.next;
        }

        temp.next = curr.next;
        curr.next = temp;

        return head;
    }

    public static int MiddleLinkedList(Node head){
        if(head == null){
            return -1;
        }

        Node slow = head;
        Node fast = head;

        //fast jumps two nodes at a time
        //slow jumps one node at a time.

//        exiting conditions
        //if there are even node fast == null
        //if odd nodes fast.next == null
        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public static int LastNth(Node head, int n){
        if(head == null){
            return -1;
        }

        Node first = head;

        for(int i = 0; i < n; i++){
            if(first == null){
                return -1;
            }
            first = first.next;
        }

        Node second = head;

        while(first!=null){
            first = first.next;
            second = second.next;
        }
        return second.data;
    }

    public static Node ReverseLinkedList(Node head){
        if(head == null) return null;
        if(head.next == null) return head;

        Node prev = null;

        Node curr = head;
        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static Node RecursiveReverse(Node curr, Node prev){
        if(curr == null) return prev;

        Node next = curr.next;
        curr.next = prev;
        return RecursiveReverse(next,curr);
    }

}
