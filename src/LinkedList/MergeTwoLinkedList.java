package LinkedList;
//class Node
//{
//    int data;
//    Node next;
//    Node(int d) {data = d; next = null; }
//}
public class MergeTwoLinkedList {
    Node sortedMerge(Node list1, Node list2) {
       if(list1 == null) return list2;
       if(list2 == null) return list1;

       Node head = null;
       Node tail = null;

       if( list1.data <= list2.data){
           head = tail = list1;
           list1 = list1.next;
       }
       else{
           head = tail = list2;
           list2 = list2.next;
       }

       while(list1 != null && list2 != null){
           if(list1.data <= list2.data){
               tail.next = list1;
               tail = list1;
               list1 = list1.next;
           }
           else{
               tail.next = list2;
               tail = list2;
               list2 = list2.next;
           }
       }

       if(list1 == null){
           tail.next = list2;
       }
       else{
           tail.next = list1;
       }
       return head;
    }
}
